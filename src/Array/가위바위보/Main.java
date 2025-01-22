package Array.가위바위보;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public String solution(int n, int[] A, int[] B){
        String answer = "";

        for(int i=0;i<n;i++){
            if(A[i]==B[i]) answer += "D";
            else if (A[i]==1 && B[i]==3) answer += "A";
            else if (A[i]==2 && B[i]==1) answer += "A";
            else if (A[i]==3 && B[i]==2) answer += "A";
            else answer +="B";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T =  new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        for(int i = 0;i < n;i++){
            A[i] = scanner.nextInt();
        }
        for(int i = 0;i < n;i++){
            B[i] = scanner.nextInt();
        }

        for(char x: T.solution(n,A,B).toCharArray()) System.out.println(x);
    }
}
