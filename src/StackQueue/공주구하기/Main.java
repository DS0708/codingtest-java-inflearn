package StackQueue.공주구하기;

import java.util.*;

public class Main {
    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> Q = new ArrayDeque<>();
        for(int i=1; i<=n; i++) Q.offer(i);
        int cnt=0;
        while(Q.size()>1){
            cnt++;
            if(cnt==k){
                cnt=0;
                Q.poll();
            }else{
                Q.offer(Q.poll());
            }
        }
        return answer=Q.poll();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(T.solution(n,k));
    }
}
