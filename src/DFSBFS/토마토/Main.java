package DFSBFS.토마토;

import java.io.*;
import java.util.*;

public class Main {
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int R,C;
    static int[][] map;
    static ArrayList<int []> startList;
    static int targetTomato = 0;
    static int day = 0;

    public static void BFS(){
        Queue<int[]> Q = new ArrayDeque<>();
        for(int[] start : startList) Q.offer(start);
        int size = Q.size();
        int sizeCount = 0;
        day++;
        while(!Q.isEmpty()){
            int[] cur = Q.poll();
            sizeCount++;
            for(int i=0; i<4; i++){
                int nr = cur[0] + dr[i];
                int nc = cur[1] + dc[i];
                if(1<=nr&&nr<=R && 1<=nc&&nc<=C && map[nr][nc]==0){
                    Q.offer(new int[]{nr,nc});
                    targetTomato--;
                    map[nr][nc] = 1;
                }
            }
            if(targetTomato<=0) break;
            if(size==sizeCount){
                day++;
                size = Q.size();
                sizeCount = 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        map = new int[R+1][C+1];
        startList = new ArrayList<>();
        for(int i=1; i<=R; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=C; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==1) startList.add(new int[]{i,j});
                if(map[i][j]==0) targetTomato++;
            }
        }
        if(targetTomato==0) System.out.println(0);
        else if (startList.isEmpty()) System.out.println(-1);
        else {
            BFS();
            if(targetTomato<=0) System.out.println(day);
            else System.out.println(-1);
        }
    }
}
