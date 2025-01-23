package TwoPointers.공통원소구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public List<Integer> solution(int[] arr1, int[] arr2){
        List<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while(p1 < arr1.length && p2 < arr2.length){
            if(arr1[p1]==arr2[p2]) answer.add(arr1[p1++]);
            else if(arr1[p1]<arr2[p2]) p1++;
            else p2++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) arr1[i] = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) arr2[i] = scanner.nextInt();

        for(int x : T.solution(arr1,arr2)) System.out.print(x+" ");
    }
}
