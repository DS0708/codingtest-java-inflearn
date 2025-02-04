package SortingAndSearching.뮤직비디오;

import java.util.*;

public class Main{
    public int count(int[] arr, int capacity){
        int count = 1;
        int dvd = 0;
        for (int x : arr){
            dvd +=x;
            if(dvd > capacity){
                count ++;
                dvd = x;
            }
        }
        return count;
    }

    public int solution(int n, int m, int[] arr) {
        int answer = -1;

        int sum = Arrays.stream(arr).sum();
        int min = sum/m;
        int max = sum;

        while(min<=max){
            int mid = min + (max-min)/2;
            if(count(arr,mid) > m){
                min = mid + 1;
            }else{
                answer = mid;
                max = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        System.out.println(T.solution(n,m,arr));
    }
}
