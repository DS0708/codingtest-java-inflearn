package SortingAndSearching.QuickSort;

import java.util.Scanner;

public class Main {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int s, int e, int key) {
        if(s < e){
            int pivotIdx = partition(arr,s,e);
            if(pivotIdx == key) return;
            else if(pivotIdx > key) quickSort(arr,s,pivotIdx-1, key);
            else quickSort(arr,pivotIdx+1,e,key);
        }
    }
    public static int partition(int[] arr, int s, int e){
        if(s+1==e){
            if(arr[s] > arr[e]) swap(arr,s,e);
            return e;
        }else{
            int m = s + (e-s)/2;
            swap(arr,s,m);
            int pivot = arr[s];
            int i = s+1;
            int j = e;
            while ( i<= j){
                while(i<=e && arr[i] < pivot) i++;
                while(j>=s+1 && arr[j] > pivot) j--;
                if(i <= j) swap(arr,i++,j--);
            }
            swap(arr,s,j);
            return j;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int key = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        quickSort(arr,0,n-1, key-1);
        System.out.println(arr[key-1]);
    }
}
