package HashMapTreeSet.아나그램;

import java.util.*;

public class Main {
    public String solution(String str1, String str2) {
        String answer = "YES";
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(char ch : str2.toCharArray()) {
            if(!map.containsKey(ch) || map.get(ch)==0){
                answer = "NO";
                break;
            }
            map.put(ch, map.get(ch)-1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();

        System.out.println(T.solution(str1,str2));
    }
}
