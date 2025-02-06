package DFSBFS.미로의최단거리통로;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int R=7;
    static int C=7;
    static int[][] map;
    static int[][] dis;
    static int answer = -1;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    public static void BFS(int sr, int sc){
        Queue<int[]> Q = new ArrayDeque<>();
        Q.offer(new int[]{sr,sc});
        map[sr][sc] = 1;
        while(!Q.isEmpty()){
            int[] cur = Q.poll();
            if(cur[0]==R && cur[1]==C){
                answer = dis[cur[0]][cur[1]];
                break;
            }
            for(int i=0; i<4; i++){
                int nr = cur[0] + dr[i];
                int nc = cur[1] + dc[i];
                if(1<=nr&&nr<=R && 1<=nc&&nc<=C && map[nr][nc]==0){
                    Q.offer(new int[]{nr,nc});
                    map[nr][nc] = 1;
                    dis[nr][nc] = dis[cur[0]][cur[1]] + 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        map = new int[R+1][C+1];
        dis = new int[R+1][C+1];
        for(int i=1; i<=R; i++){
            for(int j=1; j<=C; j++){
                map[i][j] = sc.nextInt();
            }
        }
        BFS(1,1);
        System.out.println(answer);
    }
}
