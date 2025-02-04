package RecursiveTreeGraph.이진수출력;

import java.util.Scanner;

public class Main {
    public static void recursive(int n){
        if(n==0) return;
        recursive(n/2);
        System.out.print(n%2+ " ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        recursive(n);
    }
}
