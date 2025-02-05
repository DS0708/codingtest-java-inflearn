package DFSBFS.최대점수구하기;

import java.io.*;
import java.util.*;

public class Main {
    static int timeLimit, n;
    static int maxScore = -1;
    public static void DFS(int L, int score, int time, int[][] questions){
        if(time > timeLimit) return;
        if(L==n) maxScore = Math.max(score, maxScore);
        else if (L<n){
            DFS(L+1, score+questions[L+1][0], time+questions[L+1][1], questions);
            DFS(L+1, score, time, questions);
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        timeLimit = Integer.parseInt(st.nextToken());
        int[][] questions = new int[n+1][2];
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            questions[i][0] = Integer.parseInt(st.nextToken());
            questions[i][1] = Integer.parseInt(st.nextToken());
        }
        DFS(0,0,0,questions);
        System.out.println(maxScore);
    }
}
