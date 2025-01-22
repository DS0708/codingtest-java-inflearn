package String.대소문자변환;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";

        for(char ch : str.toCharArray()){
            if(Character.isLowerCase(ch)) answer += Character.toUpperCase(ch);
            else answer += Character.toLowerCase(ch);
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(T.solution(str));
    }
}
