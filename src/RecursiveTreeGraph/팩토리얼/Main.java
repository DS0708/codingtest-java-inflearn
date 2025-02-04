package RecursiveTreeGraph.팩토리얼;

import java.util.Scanner;

public class Main {
    public static int factorial(int n){
        if(n==1) return 1;
        else return factorial(n-1)*n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
}
