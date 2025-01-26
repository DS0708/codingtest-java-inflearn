package StackQueue.후위식연산;

import java.util.*;

public class Main {
    public int calculate(char operator, int rn, int ln){
        int answer = 0;
        switch (operator){
            case '+':
                answer = ln + rn;
                break;
            case '-':
                answer = ln - rn;
                break;
            case '*':
                answer = ln * rn;
                break;
            case '/':
                answer = ln / rn;
                break;
        }
        return answer;
    }

    public int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if('1'<=ch && ch<='9') stack.push(ch-'0');
            else{
                stack.push(calculate(ch,stack.pop(),stack.pop()));
            }
        }

        answer = stack.pop();

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
