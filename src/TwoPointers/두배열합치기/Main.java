package TwoPointers.두배열합치기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public List<Integer> solution(int[] arr1, int[] arr2) {
        List<Integer> answer = new ArrayList<>();
        int p1=0;
        int p2=0;

        while(true){
            if(arr1[p1] <= arr2[p2]) answer.add(arr1[p1++]);
            else answer.add(arr2[p2++]);

            if(p1==arr1.length){
                for(int i=p2; i<arr2.length; i++) answer.add(arr2[i]);
                break;
            }
            if(p2==arr2.length){
                for(int i=p1; i<arr1.length; i++) answer.add(arr1[i]);
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++) arr1[i] = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i < m; i++) arr2[i] = scanner.nextInt();

        for(int x : T.solution(arr1, arr2)) System.out.print(x+" ");
    }
}
