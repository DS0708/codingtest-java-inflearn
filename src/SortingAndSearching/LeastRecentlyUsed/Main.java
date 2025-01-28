package SortingAndSearching.LeastRecentlyUsed;

import java.util.*;

public class Main {

    public int[] solution(int size, int[] arr) {
        int[] cache = new int[size];

        for(int num : arr){
            //cache hit/miss 판별
            int pos = -1;
            for(int i=0; i<size; i++) {
                if(cache[i]==num){
                    pos = i;
                    break;
                }
            }
            //cache miss일때, pos==-1, 모든 숫자를 오른쪽으로 밀기
            if(pos==-1){
                for(int i=size-2; i>=0; i--) cache[i+1] = cache[i];
            }else{ //cache hit일때, pos!=-1, hit위치까지 오른쪽으로 밀기
                for(int i=pos-1; i>=0; i--) cache[i+1] = cache[i];
            }
            cache[0]=num;
        }

        return cache;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        for(int x : T.solution(size, arr)) System.out.print(x+" ");
    }
}
