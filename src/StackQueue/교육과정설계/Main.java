package StackQueue.교육과정설계;

import java.util.*;

public class Main {
    public String solution(String str1, String str2) {
        String answer = "YES";
        Queue<Character> Q = new ArrayDeque<>();
        for(char ch : str1.toCharArray()) Q.offer(ch);

        for(char ch : str2.toCharArray()){
            if(Q.contains(ch)){
                if(ch!=Q.poll()){
                    answer = "NO";
                    break;
                }
            }
        }
        if(!Q.isEmpty()) answer = "NO";

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println(T.solution(str1, str2));
    }
}
