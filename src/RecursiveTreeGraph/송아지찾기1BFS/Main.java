package RecursiveTreeGraph.송아지찾기1BFS;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] dis = {-1,1,5};
    public static int BFS(int start, int end){
        int level = 0;
        boolean[] V = new boolean[10001];
        Queue<Integer> Q = new ArrayDeque<>();
        Q.offer(start);
        V[start] = true;
        boolean check = false;

        while(!Q.isEmpty()){
            int size = Q.size();
            for(int i = 0; i < size; i++){
                int cur = Q.poll();
                for(int j=0; j < dis.length; j++){
                    int next = cur + dis[j];
                    if(next==end){
                        check = true;
                        break;
                    }
                    if(1<=next && next<10001 && !V[next] ) {
                        Q.offer(next);
                        V[next] = true;
                    }
                }
                if(check) break;
            }
            level++;
            if(check) break;
        }

        return level;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int E = scanner.nextInt();
        System.out.println(BFS(S,E));
    }
}
