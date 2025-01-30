package SortingAndSearching.이분검색;


import java.util.*;

public class Main2{
    public int solution(int n, int m, int[] arr) {
        Arrays.sort(arr);
        int answer = Arrays.binarySearch(arr,m) + 1;

        return answer;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        System.out.println(T.solution(n,m,arr));
    }
}

