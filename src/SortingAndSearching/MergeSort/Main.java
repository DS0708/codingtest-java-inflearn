package SortingAndSearching.MergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void mergeSort(int[] arr, int s, int e) {
        if(e-s < 1) return;
        int m = s + (e-s)/2;
        mergeSort(arr, s, m);
        mergeSort(arr, m+1, e);
        int[] tmp = arr.clone();
        int k = s;
        int idx1 = s;
        int idx2 = m+1;
        while(idx1 <= m && idx2 <= e) {
            if(arr[idx1] <= arr[idx2])  tmp[k++] = arr[idx1++];
            else tmp[k++] = arr[idx2++];
        }
        while(idx1 <= m) tmp[k++] = arr[idx1++];
        while(idx2 <= e) tmp[k++] = arr[idx2++];
        for(int i = s; i <= e; i++) arr[i] = tmp[i];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) arr[i] = scanner.nextInt();
        mergeSort(arr,1,n);
        for(int i = 1; i <= n; i++) System.out.print(arr[i] + " ");
    }
}
