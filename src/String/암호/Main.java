package String.암호;

import java.util.*;

public class Main {
    public String solution(int n,String str) {
        String answer = "";

        for(int i=0; i<n; i++){
            String sub = str.substring(0,7).replace("#","1").replace("*","0");
            char ch = (char)Integer.parseInt(sub,2);
            answer +=ch;
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();

        System.out.println(T.solution(n,str));
    }
}
