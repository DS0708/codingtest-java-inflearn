package RecursiveTreeGraph.부분집합구하기DFS;

import java.util.Scanner;

public class Main {
    static int n;
    static int[] arr;
    public static void DFS(int L){
        if(L==n+1){
            String tmp = "";
            for(int i=1; i<arr.length; i++){
                if(arr[i]==1) tmp += (i+" ");
            }
            if(tmp.length()>0) System.out.println(tmp);
        }else{
            arr[L] = 1;
            DFS(L+1);
            arr[L] = 0;
            DFS(L+1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n+1];
        DFS(1);
    }
}
