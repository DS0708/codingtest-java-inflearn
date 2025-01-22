package String.문자열압축;

import java.util.*;

public class Main {
    public String solution(String str) {
        String answer = "";
        int p = 1;
        char ch;
        int len = str.length();
        str += " ";

        for(int i=0; i<len; i++) {
            ch = str.charAt(i);
            if(ch==str.charAt(i+1)){
                p++;
            }else{
                answer += ch;
                if(p >=2) answer += p;
                p = 1;
            }
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
