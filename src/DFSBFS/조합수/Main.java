package DFSBFS.조합수;

import java.util.Scanner;

public class Main {
    static int[][] C;
    public static int combination(int n, int r) {
        if(C[n][r] > 0) return C[n][r];
        if(n==r || r==0) return C[n][r]=1;
        else return combination(n-1,r-1) + combination(n-1,r);
    }
    public static void main(String[] args) {
        // nCr = n-1Cr + n-1Cr-1 -> n개에서 r개를 뽑는 경우의 수는, n-1개에서 자기 자신을 뽑는 경우의 수(n-1Cr-1) + 자기 자신을 뽑지 않는 경우의 수(n-1Cr)
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        C = new int[n+1][n+1];
        System.out.println(combination(n,r));
    }
}
