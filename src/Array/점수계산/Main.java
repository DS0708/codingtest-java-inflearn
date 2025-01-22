package Array.점수계산;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public int solution(int n, int[] arr){
        int answer = 0;
        int cnt = 1;

        for (int i=0; i<n; i++){
            if(arr[i]==1){
                answer +=cnt;
                cnt++;
            }else {
                cnt = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        System.out.println(T.solution(n, arr));
    }
}
