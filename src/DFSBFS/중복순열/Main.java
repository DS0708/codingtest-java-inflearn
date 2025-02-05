package DFSBFS.중복순열;

import java.util.Scanner;

public class Main {
    static int n,m;
    static int[] arr;
    public static void DFS(int num){
        if(num==m) {
            for(int x : arr) System.out.print(x+" ");
            System.out.println();
        } else{
            for(int i=1; i<=n; i++){
                arr[num] = i;
                DFS(num+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        arr = new int[m];
        DFS(0);
    }
}
