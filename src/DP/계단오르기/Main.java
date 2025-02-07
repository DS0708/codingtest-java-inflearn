package DP.계단오르기;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] DP = new int[n+1];

        if(n==1) {
            System.out.println(1);
            return;
        }else if(n==2){
            System.out.println(2);
            return;
        }

        DP[1]=1;
        DP[2]=2;
        for(int i=3; i<=n; i++){
            DP[i] = DP[i-1] + DP[i-2];
        }

        System.out.println(DP[n]);
    }
}
