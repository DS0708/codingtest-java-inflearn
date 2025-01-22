package String.숫자만추출;

import java.util.*;

public class Main {
    public int solution(String str) {
        String answer = "";
        int intAnswer = -1;

        for(char ch : str.toCharArray()) {
            if('0'<=ch && ch<='9') answer += ch;
        }
        intAnswer = Integer.parseInt(answer);

        return intAnswer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(T.solution(str));
    }
}
