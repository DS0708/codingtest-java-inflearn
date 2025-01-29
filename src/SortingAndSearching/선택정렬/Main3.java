package SortingAndSearching.선택정렬;

import java.util.*;

public class Main3 {
    public int[] solution(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int idx = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[idx]>arr[j]) idx=j;
            }
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        for(int x : T.solution(arr)) System.out.print(x+" ");
    }
}

