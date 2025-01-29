package SortingAndSearching.삽입정렬;

import java.util.*;

public class Main3 {

    public List<Integer> solution(int[] arr) {
        List<Integer> list = new LinkedList<>();
        for(int i=0;i<arr.length;i++) list.add(arr[i]);

        for(int i=1; i<list.size(); i++){
            int j;
            for(j=i-1; j>=0; j--){
                if(list.get(j) < list.get(i)) break;
            }
            int tmp = list.get(i);
            list.remove(i);
            list.add(j+1,tmp);
        }

        return list;
    }

    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        for(int x : T.solution(arr)) System.out.print(x+" ");
    }
}
