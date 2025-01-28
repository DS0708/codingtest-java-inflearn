package SortingAndSearching.선택정렬;

import java.util.*;

public class Main {

    public int[] solution(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int idx = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[idx]){
                    idx = j;
                }
                int tmp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = tmp;
            }

        }

        return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        for(int x : T.solution(arr)) System.out.print(x+" ");
    }
}

