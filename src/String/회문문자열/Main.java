package String.회문문자열;

import java.util.*;

public class Main {
    public String solution(String str) {
        String answer = "NO";

        String tmp = str.toLowerCase().replaceAll("[^a-z]","");
        if(tmp.equals(new StringBuilder(tmp).reverse().toString())) answer = "YES";

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(T.solution(str));
    }
}
