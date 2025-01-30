package SortingAndSearching.장난꾸러기;

import java.util.*;

public class Main{
    public int[] solution(int[] arr) {
        int[] answer = new int[2];
        int[] temp = arr.clone();
        Arrays.sort(temp);
        int idx = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] != temp[i]) answer[idx++] = i+1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        for(int x : T.solution(arr)) System.out.print(x+" ");

    }
}
