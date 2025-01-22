package Array.멘토링;

import java.util.Scanner;

public class Main {
    public int solution(int n,int m, int[][] arr){
        int answer = 0;
        int[][] mentor = new int[n][n];

        for(int i=0; i<m; i++){
            for(int j=1; j<n; j++){
                for(int k=j-1; k>=0; k--){
                    int a = arr[i][j]-1;
                    int b = arr[i][k]-1;
                    mentor[a][b] = 1;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j) continue;
                if(mentor[i][j]==0) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(T.solution(n,m, arr));
    }
}
