package String.중복문자제거;

import java.util.*;

public class Main {
    public String solution(String str) {
        String answer = "";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int pos = str.indexOf(ch);
            if(pos==i) answer+=ch;
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(T.solution(str));
    }
}
