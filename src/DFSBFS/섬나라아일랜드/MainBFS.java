package DFSBFS.섬나라아일랜드;

import java.io.*;
import java.util.*;

public class MainBFS {
    static int N;
    static int[][] map;
    static int[] dr = {-1,1,0,0,-1,1,-1,1};
    static int[] dc = {0,0,-1,1,-1,1,1,-1};
    public static void BFS(int r, int c){
        Queue<int []> queue = new LinkedList<>();
        queue.add(new int[]{r,c});
        map[r][c] = 0;
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            for(int i = 0; i < dr.length; i++){
                int nr = cur[0] + dr[i];
                int nc = cur[1] + dc[i];
                if(1<=nr&&nr<=N && 1<=nc&&nc<=N && map[nr][nc]==1){
                    map[nr][nc] = 0;
                    queue.offer(new int[]{nr,nc});
                }
            }
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
                BFS(target[0],target[1]);
                answer++;
            }
        }
        System.out.println(answer);
    }
}
