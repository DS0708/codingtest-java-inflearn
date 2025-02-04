package RecursiveTreeGraph.경로탐색DFS인접행렬;

import java.util.Scanner;

public class Main {
    static int[][] graph;
    static boolean[] V;
    static int answer = 0;
    static int n;
    public static void DFS(int node){
        if(node == n) answer++;
        else{
            for(int i=1; i<=n; i++){
                if(!V[i] && graph[node][i]==1){
                    V[i] = true;
                    DFS(i);
                    V[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int m = scanner.nextInt();
        graph = new int[n+1][n+1];
        V = new boolean[n+1];
        for(int i=0; i<m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a][b] = 1;
        }
        V[1] = true;
        DFS(1);
        System.out.println(answer);
    }
}
