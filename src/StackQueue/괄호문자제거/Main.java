package StackQueue.괄호문자제거;

import java.util.*;

public class Main {
    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()) {
            if(ch==')'){
                while(stack.pop()!='(');
            }else{
                stack.push(ch);
            }
        }
        for(int i=0; i<stack.size(); i++) answer += stack.get(i);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
