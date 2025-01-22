package String.단어뒤집기;

import java.util.*;

public class Main {
    public List<String> solution(List<String> str, int n) {
        List<String> answer = new ArrayList<>();

        for(String s : str){
            answer.add(new StringBuilder(s).reverse().toString());
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int n = scanner.nextInt();
        for(int i=0; i<n; i++) list.add(scanner.next());

        for(String str : T.solution(list,n)){
            System.out.println(str);
        }
    }
}
