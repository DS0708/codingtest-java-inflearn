package Array.등수구하기;

import java.util.*;

public class Main2 {
    //Time Complexity : O(n*logn)
    public List<Integer> solution(int[] arr){
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        Integer[] referenceArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        //O(n*logn)
        Arrays.sort(referenceArr,Collections.reverseOrder());
        for(int i=0; i<referenceArr.length; i++){
            if(!rankMap.containsKey(referenceArr[i])) rankMap.put(referenceArr[i],rank);
            rank++;
        }

        for(int i=0; i<arr.length; i++){
            answer.add(rankMap.get(arr[i]));
        }

        return answer;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        for(int x : T.solution(arr)) System.out.print(x+" ");
    }
}
