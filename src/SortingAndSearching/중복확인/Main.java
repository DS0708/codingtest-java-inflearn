package SortingAndSearching.중복확인;

import java.util.*;

public class Main{
    public String solution(int[] arr) {
        String answer = "U";
        Set<Integer> set = new HashSet<>();

        for(int x : arr) set.add(x);

        if(set.size() != arr.length) answer = "D";

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        System.out.println(T.solution(arr));

    }
}
