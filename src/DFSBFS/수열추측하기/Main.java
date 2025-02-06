package DFSBFS.수열추측하기;

import java.util.Scanner;

public class Main {
    static int[][] C;
    static int[] Xcombi;
    static int n,low;
    static int[] answer;
    static boolean[] visited;
    static boolean flag = false;
    public static int combination(int n, int r){
        if(C[n][r]>0) return C[n][r];
        if(n==r || r==0) return C[n][r]=1;
        else return combination(n-1,r)+combination(n-1,r-1);
    }
    public static void DFS(int L, int sum){
        if(flag) return;
        if(sum>low) return;
        if(L==n){
            if(sum==low) {
                for(int i=1; i<=n; i++) System.out.print(answer[i] + " ");
                flag = true;
            }
        }else{
            for(int i=1; i<=n; i++){
                if(!visited[i]){
                    visited[i] = true;
                    answer[L+1] = i;
                    DFS(L+1, sum + Xcombi[L+1]*i);
                    visited[i] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        low = scanner.nextInt();
        Xcombi = new int[n+1];
        C = new int[n+1][n+1];
        answer = new int[n+1];
        visited = new boolean[n+1];
        for(int i=1 ;i<=n; i++) Xcombi[i] = combination(n-1,i-1);
        DFS(0,0);
    }
}
