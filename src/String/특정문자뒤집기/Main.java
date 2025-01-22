package String.특정문자뒤집기;

import java.util.*;

public class Main {
    public String solution(String s) {
        char[] charArray = s.toCharArray();
        int lt = 0;
        int rt = s.length()-1;

        while (lt <= rt) {
            if (!Character.isAlphabetic(charArray[lt])){
                lt++;
            }else if (!Character.isAlphabetic(charArray[rt])){
                rt--;
            }else{
                char temp = s.charAt(lt);
                charArray[lt] = charArray[rt];
                charArray[rt] = temp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(charArray);
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
