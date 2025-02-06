package Greedy.프림;

import java.io.*;
import java.util.*;

public class Main {
    static List<Edge>[] graph;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        graph = new ArrayList[v+1];
        visited = new boolean[v+1];
        for(int i=1;i<=v;i++) graph[i] = new ArrayList<>();
        int e = Integer.parseInt(st.nextToken());
        int answer = 0;
        for(int i=0; i<e; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int val = Integer.parseInt(st.nextToken());
            graph[start].add(new Edge(end, val));
            graph[end].add(new Edge(start, val));
        }
        //prim
        PriorityQueue<Edge> PQ = new PriorityQueue<>((o1,o2)->o1.weight-o2.weight);
        PQ.offer(new Edge(1,0));
        while(!PQ.isEmpty()){
            Edge cur = PQ.poll();
            if(!visited[cur.node]){
                visited[cur.node] = true;
                answer += cur.weight;
                for(Edge edge : graph[cur.node])  if(!visited[edge.node]) PQ.offer(edge);
            }
        }
        System.out.println(answer);
    }
    public static class Edge{
        int node;
        int weight;
        public Edge(int node, int weight){
            this.node = node;
            this.weight = weight;
        }
    }

}
