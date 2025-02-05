package DFSBFS.순열구하기;

import java.util.Scanner;

public class Main {
    static boolean[] visited;
    static int[] arr;
    public static void DFS(int L, int max, int[] printNum){
        if(L==max) {
            for(int x : printNum) System.out.print(x + " ");
            System.out.println();
        }else if (L<max){
            for(int i=0 ; i<arr.length ; i++){
                if(!visited[i]){
                    visited[i] = true;
                    printNum[L] = arr[i];
                    DFS(L+1, max, printNum);
                    visited[i] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        visited = new boolean[n];
        int m = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        int[] printNum = new int[m];
        DFS(0,m,printNum);
    }
}
