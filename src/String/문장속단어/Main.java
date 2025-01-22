package String.문장속단어;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        int pos = -1;
        str += " ";

        while((pos=str.indexOf(' ')) != -1){
            String sub = str.substring(0,pos);
            int len = sub.length();
            if(len > max){
                max = len;
                answer = sub;
            }
            str = str.substring(pos+1);
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
