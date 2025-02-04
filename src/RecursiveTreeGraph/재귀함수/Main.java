package RecursiveTreeGraph.재귀함수;

import java.util.Scanner;

public class Main {
    public static void recursive(int n){
        if (n==0) return;
        recursive(n-1);
        System.out.print(n+" ");
        return;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        recursive(n);
    }
}
