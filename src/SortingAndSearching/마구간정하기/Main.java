package SortingAndSearching.마구간정하기;

import java.util.*;

public class Main{
    public int counting(int[] arr, int distance){
        int count = 1;
        int pos = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] >= pos + distance){
                count++;
                pos = arr[i];
            }
        }

        return count;
    }

    public int solution(int n, int m, int[] arr) {
        int answer = -1;
        // nlogn
        Arrays.sort(arr);
        // n
        int rt = Arrays.stream(arr).max().getAsInt();
        int lt = Arrays.stream(arr).min().getAsInt();

        // logn * n = nlogn
        while(lt <= rt){
            int mid = lt + (rt - lt)/2;
            // n
            if(counting(arr,mid) >= m){
                answer = mid;
                lt = mid + 1;
            }else{
                rt = mid - 1;
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

