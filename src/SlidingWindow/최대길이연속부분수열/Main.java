package SlidingWindow.최대길이연속부분수열;

import java.util.Scanner;

public class Main {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt=0;
        int rt;
        int cnt=0;

        for(rt=0; rt<n; rt++){
            if(arr[rt]==0) cnt++;

            if(cnt==m) answer = Math.max(answer,rt-lt+1);
            else if(cnt>m){
                while(arr[lt]==1) lt++;
                lt++;
                cnt--;
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
