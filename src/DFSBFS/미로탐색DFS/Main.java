package DFSBFS.미로탐색DFS;

import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int[][] map = new int[8][8];
    static int answer = 0;
    static boolean[][] visited = new boolean[8][8];
    public static void DFS(int r, int c){
        if(r==7 && c==7) answer++;
        else{
            for(int i=0; i<4; i++){
                int dr = r+dy[i];
                int dc = c+dx[i];
                if(1<=dr&&dr<=7 && 1<=dc&&dc<=7 && !visited[dr][dc] && map[dr][dc]==0){
                    visited[dr][dc] = true;
                    DFS(dr,dc);
                    visited[dr][dc] = false;
                }
            }
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i=1; i<=7; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=7; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        visited[1][1]=true;
        DFS(1,1);
        System.out.println(answer);
    }
}
