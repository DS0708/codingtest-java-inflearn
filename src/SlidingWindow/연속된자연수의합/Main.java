package SlidingWindow.연속된자연수의합;

import java.util.Scanner;

public class Main {
    public int solution(int n) {
        int answer = 0;
        int lt=1, rt=1;
        int sum=0;
        int m = n/2 + 1;

        for(rt=1; rt<=m; rt++){
            sum += rt;
            if(sum==n) answer++;
            while(sum>=n){
                sum -= lt++;
                if(sum==n) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(T.solution(n));
    }
}
