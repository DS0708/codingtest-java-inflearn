package RecursiveTreeGraph.경로탐색DFS인접리스트;

import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int n;
    static int answer = 0;

    public static void DFS(int node){
        if(node==n) answer++;
        else{
            for(int next : graph[node]){
                if(!visited[next]){
                    visited[next]=true;
                    DFS(next);
                    visited[next]=false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int m = scanner.nextInt();
        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        for(int i=1; i<=n; i++) graph[i] = new ArrayList<>();
        for(int i=0; i<m; i++) {
            graph[scanner.nextInt()].add(scanner.nextInt());
        }
        visited[1] = true;
        DFS(1);
        System.out.println(answer);
    }
}


