package RecursiveTreeGraph.그래프최단거리;


import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] dis;

    public static void BFS(int start){
        visited[start] = true;
        Queue<Integer> Q = new ArrayDeque<>();
        Q.offer(start);

        while(!Q.isEmpty()){
            int cur = Q.poll();
            for(int next : graph[cur]){
                if(!visited[next]){
                    dis[next] = dis[cur] + 1;
                    Q.offer(next);
                    visited[next] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) graph[i] = new ArrayList<>();
        visited = new boolean[n + 1];
        dis = new int[n + 1];
        for (int i = 1; i <= m; i++) graph[scanner.nextInt()].add(scanner.nextInt());
        BFS(1);
        for(int i=2; i<=n; i++) System.out.println(i + " : " + dis[i]);
    }
}
