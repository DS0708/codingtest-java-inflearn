package DP.동전교환;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for(int i = 0; i < n; i++) coins[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] DP = new int[m+1];

        for(int i=0; i<n; i++){
            for(int j=coins[i]; j<=m; j++){
                if(DP[j]==0) DP[j] = DP[j-coins[i]]+1;
                else DP[j] = Math.min(DP[j], DP[j-coins[i]]+1);
            }
        }

        System.out.println(DP[m]);
    }
}
