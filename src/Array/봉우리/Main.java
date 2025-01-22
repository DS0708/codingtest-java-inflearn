package Array.봉우리;

import java.util.Scanner;

public class Main {
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,-1,1};
    public int solution(int n, int[][] arr){
        int answer = 0;

        for(int i=1;i<=n;i++){
            for(int j=1; j<=n; j++){
                boolean check = true;
                for(int k=0; k<4; k++){
                    if(arr[i][j] <= arr[i+dy[k]][j+dx[k]]){
                        check = false;
                        break;
                    }
                }
                if(check) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n+2][n+2];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(T.solution(n, arr));
    }
}
