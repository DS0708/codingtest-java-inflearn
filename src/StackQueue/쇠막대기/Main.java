package StackQueue.쇠막대기;

import java.util.*;

public class Main {
    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)=='(') {
                if(i+1<str.length() && str.charAt(i+1)==')') {
                    answer += stack.size();
                    i++;
                }else{
                    stack.push(str.charAt(i));
                }
            }else{
                answer ++;
                stack.pop();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
