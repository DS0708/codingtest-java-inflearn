package HashMapTreeSet.K번째큰수;

import java.util.*;

public class Main {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        Set<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int z=j+1; z<n; z++){
                    treeSet.add(arr[i]+arr[j]+arr[z]);
                }
            }
        }
        int count = 0;
        for(int x : treeSet){
            count++;
            if(count==k){
                answer = x;
                break;
            }
        }
        if(count<k) answer = -1;

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scanner.nextInt();

        System.out.println(T.solution(n,k,arr));
    }
}
