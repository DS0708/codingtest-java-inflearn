package DP.최대점수구하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] DP = new int[m+1];

        for(int i=0; i<n; i++){
            int score = sc.nextInt();
            int time = sc.nextInt();
            for(int j=m; j>=time; j--){
                if(DP[j]==0) DP[j] = DP[j-time] + score;
                else DP[j] = Math.max(DP[j], DP[j-time] + score);
            }
        }

        System.out.println(DP[m]);
    }
}
