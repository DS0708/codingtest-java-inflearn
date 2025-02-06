package Greedy.다익스트라;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        // 테스트 케이스 실행
        int[][] road = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
        System.out.println(s.solution(5, road, 3));
    }

    static class Edge {
        int node;
        int val;
        public Edge(int node, int val){
            this.node = node;
            this.val = val;
        }
    }

    static class Solution {
        int[] dis;
        List<Edge>[] graph;
        public int solution(int N, int[][] road, int K) {
            int answer = 0;
            dis = new int[N+1];
            for(int i=1; i<=N; i++) dis[i] = Integer.MAX_VALUE;
            graph = new ArrayList[N+1];
            for(int i=1; i<=N; i++) graph[i] = new ArrayList<>();

            for(int[] edge : road){
                int a = edge[0];
                int b = edge[1];
                int v = edge[2];
                graph[a].add(new Edge(b,v));
                graph[b].add(new Edge(a,v));
            }

            dijkstra(1,0);

            for(int i=1; i<=N; i++) if(dis[i]<=K) answer++;
            return answer;
        }

        public void dijkstra(int s, int v){
            PriorityQueue<Edge> PQ = new PriorityQueue<>((o1,o2)->o1.val-o2.val);
            PQ.offer(new Edge(s,v));
            dis[1]=0;
            while(!PQ.isEmpty()){
                Edge cur = PQ.poll();
                if(cur.val > dis[cur.node]) continue;
                for(Edge target : graph[cur.node]){
                    if(dis[target.node] > cur.val+target.val){
                        dis[target.node] = cur.val+target.val;
                        PQ.offer(new Edge(target.node, dis[target.node]));
                    }
                }
            }
        }
    }
}