package SortingAndSearching.삽입정렬;

import java.util.*;

public class Main2 {
    public int[] solution(int[] arr) {
        for(int target=1; target<arr.length; target++){
            int left = target-1;
            int targetNum = arr[target];
            while(left >=0 && arr[left] > targetNum){
                arr[left+1] = arr[left];
                left--;
            }
            arr[left+1] = targetNum;
        }

        return arr;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        for(int x : T.solution(arr)) System.out.print(x+" ");
    }
}
