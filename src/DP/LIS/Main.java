package DP.LIS;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] DP = new int[n];
        DP[0]=1;
        for(int i=1; i<n; i++){
            int maxTemp = -1;
            for(int j=i; j>=0; j--){
                if(maxTemp < DP[j] && arr[j]<arr[i]){
                    DP[i] = DP[j]+1;
                    maxTemp = DP[j];
                }
            }
            if(DP[i]==0) DP[i] = 1;
        }

        System.out.println(Arrays.stream(DP).max().getAsInt());
    }
}
