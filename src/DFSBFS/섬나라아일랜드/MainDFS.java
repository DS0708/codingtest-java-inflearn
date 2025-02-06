package DFSBFS.섬나라아일랜드;

import java.io.*;
import java.util.*;

public class MainDFS {
    static int N;
    static int[][] map;
    static int[] dr = {-1,1,0,0,-1,1,-1,1};
    static int[] dc = {0,0,-1,1,-1,1,1,-1};
    public static void DFS(int r, int c){
        map[r][c] = 0;
        for(int i=0;i<8;i++){
            int nr = r+dr[i];
            int nc = c+dc[i];
            if(1<=nr&&nr<=N && 1<=nc&&nc<=N && map[nr][nc]==1) DFS(nr,nc);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        map = new int[N+1][N+1];
        List<int []> landList = new ArrayList<>();
        int answer = 0;
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==1) landList.add(new int[]{i,j});
            }
        }
        for(int[] target : landList){
            if(map[target[0]][target[1]]==1) {
                DFS(target[0],target[1]);
                answer++;
            }
        }
        System.out.println(answer);
    }
}
