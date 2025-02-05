package SortingAndSearching.MergeSort;

import java.util.Scanner;

public class Main2 {
    public static void mergeSort(int[] arr, int s, int e){
        if (e - s < 1) return;
        int m = s + (e-s)/2;
        mergeSort(arr, s, m);
        mergeSort(arr, m+1, e);
        int k = s;
        int[] tmp = arr.clone();
        int idx1 = s;
        int idx2 = m+1;

        while(idx1 <= m && idx2 <= e){
            if(tmp[idx1] < tmp[idx2]) arr[k++] = tmp[idx1++];
            else arr[k++] = tmp[idx2++];
        }
        while(idx1 <= m) arr[k++] = tmp[idx1++];
        while(idx2 <= e) arr[k++] = tmp[idx2++];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        mergeSort(arr,0,n-1);
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
}
