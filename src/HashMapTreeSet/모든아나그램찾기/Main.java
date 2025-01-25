package HashMapTreeSet.모든아나그램찾기;

import java.util.*;

public class Main {
    public int solution(String a, String b) {
        int answer = 0;
        Map<Character, Integer> am = new HashMap<>();
        Map<Character, Integer> bm = new HashMap<>();

        for(char ch : b.toCharArray()) bm.put(ch, bm.getOrDefault(ch,0)+1);
        for(int i=0; i<=b.length()-2; i++){
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i),0)+1);
        }
        int rt = b.length()-1;
        int lt=0;
        for( ; rt<a.length() ;rt++){
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt),0)+1);
            if(am.equals(bm)) answer++;
            am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
            if(am.get(a.charAt(lt)) == 0) am.remove(a.charAt(lt));
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        System.out.println(T.solution(a, b));
    }
}
