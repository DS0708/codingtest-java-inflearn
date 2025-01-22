package Array.등수구하기;

import java.util.*;

public class Main {
    //Time Complexity : O(n^2)
    public List<Integer> solution(int[] arr){
        List<Integer> answer = new ArrayList<>();
        int cnt;

        for(int i=0; i<arr.length; i++){
            cnt = 1;
            for(int j=0; j<arr.length; j++){
                if(i==j) continue;
                if(arr[i]<arr[j]) cnt++;
            }
            answer.add(cnt);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        for(int x : T.solution(arr)) System.out.print(x+" ");
    }
}