package HashMapTreeSet.학급회장;

import java.util.*;

public class Main {
    public char solution(int n, String str) {
        char answer = ' ';
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;

        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char key : map.keySet()){
            if(max < map.get(key)){
                answer = key;
                max = map.get(key);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();

        System.out.println(T.solution(n,str));
    }
}
