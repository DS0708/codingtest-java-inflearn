package DFSBFS.조합구하기;

import java.util.Scanner;

public class Main {
    static int n,r;
    static int[] answer;
    static boolean[] visited;
    public static void DFS(int L, int s){
        if(L==r) {
            for(int i=1; i<=r; i++) System.out.print(answer[i] + " ");
            System.out.println();
        }else{
            for(int i=s; i<=n; i++){
                if(!visited[i]){
                    visited[i] = true;
                    answer[L+1] = i;
                    DFS(L+1,i+1);
                    visited[i] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        r = scanner.nextInt();
        answer = new int[r+1];
        visited = new boolean[n+1];
        DFS(0,1);
    }
}
