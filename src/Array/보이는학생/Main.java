package Array.보이는학생;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public int solution(int n,int[] arr){
        int answer = 1;
        int max = arr[0];

        for(int i=1;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
                answer ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.print(T.solution(n, arr));
    }
}
