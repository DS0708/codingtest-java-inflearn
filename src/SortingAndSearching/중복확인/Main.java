package SortingAndSearching.중복확인;

import java.util.*;

public class Main {

    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        for(int x : T.solution(arr)) System.out.println(x+" ");
    }
}
