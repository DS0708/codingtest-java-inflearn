package Array.격자판최대합;

import java.util.Scanner;

public class Main {
    //Time Complexity : O(N^2)
    public int solution(int n, int[][] map){
        int answer = 0;
        int sum1, sum2;

        for(int i=0;i<n;i++){
            sum1 = 0;
            sum2 = 0;
            for(int j=0;j<n;j++){
               sum1 += map[i][j];
               sum2 += map[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = 0;
        sum2 = 0;
        for(int i=0; i<n; i++){
            sum1 += map[i][i];
            sum2 += map[i][n-1-i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] map = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                map[i][j] = scanner.nextInt();
            }
        }

        System.out.println(T.solution(n, map));
    }
}
