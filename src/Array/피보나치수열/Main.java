package Array.피보나치수열;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n){
        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(1);
        answer.add(1);

        for(int i=2; i<n; i++){
            answer.add(answer.get(i-1) + answer.get(i-2));
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int x: T.solution(n)) System.out.print(x+" ");
    }
}
