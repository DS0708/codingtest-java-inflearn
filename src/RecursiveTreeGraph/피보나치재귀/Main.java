package RecursiveTreeGraph.피보나치재귀;

import java.util.Scanner;

public class Main {
    static int[] arr = new int[46];

    public static int fibo(int n){
        if(arr[n]!=0) return arr[n];
        return arr[n] = fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        arr[1] = 1;
        arr[2] = 1;
        fibo(n);
        for(int i=1; i<=n; i++) System.out.print(arr[i]+" ");
    }
}
