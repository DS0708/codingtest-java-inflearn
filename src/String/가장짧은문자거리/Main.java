package String.가장짧은문자거리;

import java.util.*;

public class Main {
    public int[] solution(String s, String t) {
        int[] answer = new int[s.length()];
        int p = 1000;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==t.charAt(0)){
                p=0;
            }
            answer[i] = p;
            p++;
        }
        p = 1000;
        for(int i=s.length()-1 ; i>=0; i--){
            if(s.charAt(i)==t.charAt(0)){
                p=0;
            }
            answer[i] = Math.min(answer[i],p);
            p++;
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();

        for(int a : T.solution(s, t)){
            System.out.print(a+" ");
        }
    }
}
