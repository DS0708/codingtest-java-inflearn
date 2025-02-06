package Greedy.크루스칼;

import java.io.*;
import java.util.*;

public class Main {
    static int[] unf;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        unf = new int[v+1];
        for(int i=1; i<=v; i++) unf[i] = i;
        int e = Integer.parseInt(st.nextToken());
        List<Edge> edges = new ArrayList<>();
        int answer = 0;
        for(int i=0; i<e; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int val = Integer.parseInt(st.nextToken());
            edges.add(new Edge(start,end,val));
        }
        Collections.sort(edges,(o1,o2)->o1.weight-o2.weight);
        for(Edge edge : edges){
            int fa = Find(edge.start);
            int fb = Find(edge.end);
            if(fa!=fb){
                Union(edge.start, edge.end);
                answer += edge.weight;
            }
        }
        System.out.println(answer);
    }
    public static class Edge{
        int start;
        int end;
        int weight;
        public Edge(int start,int end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }
    }
    public static void Union(int a, int b){
        int fa = Find(a);
        int fb = Find(b);
        if(fa!=fb) unf[fb] = fa;
    }
    public static int Find(int a){
        if(unf[a]==a) return a;
        else return unf[a] = Find(unf[a]);
    }
}
