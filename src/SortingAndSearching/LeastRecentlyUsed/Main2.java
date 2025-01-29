package SortingAndSearching.LeastRecentlyUsed;

import java.util.*;

public class Main2 {
    public int[] solution(int size, int[] arr) {
        int[] cache = new int[size];

        for(int job : arr){
            int pos = size-1;
            //cache hit인지 확인
            for(int i=0; i<size; i++){
                if(cache[i]==job){
                    pos = i;
                    break;
                }
            }
            for(int i=pos; i>=1; i--) cache[i] = cache[i-1];
            cache[0] = job;
        }

        return cache;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        for(int x : T.solution(size,arr)) System.out.print(x+" ");
    }
}
