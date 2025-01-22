package Array.임시반장정하기;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[][] arr){
        int answer = 0;
        int[] friend = new int[n];
        int max = -1;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                for(int k=0; k<5; k++){
                    if(arr[i][k] == arr[j][k]){
                        friend[i]++;
                        friend[j]++;
                        break;
                    }
                }
            }
        }

        for(int i=0; i<n; i++){
            if(max < friend[i]){
                answer = i+1;
                max = friend[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][5];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(T.solution(n, arr));
    }
}
