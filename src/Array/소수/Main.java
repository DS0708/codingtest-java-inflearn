package Array.소수;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public int solution(int n){
        int answer = 0;
        int[] arr = new int[n+1];

        for(int i=2; i<=n; i++){
            if(arr[i]==1) continue;
            answer++;
            for(int j=i*2; j<=n; j+=i) arr[j] = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(T.solution(n));
    }
}
