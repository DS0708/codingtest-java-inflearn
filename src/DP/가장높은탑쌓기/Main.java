package DP.가장높은탑쌓기;

import java.io.*;
import java.util.*;

public class Main {
    public static class Block{
        int baseArea;
        int height;
        int weight;
        public Block(int baseArea, int height, int weight) {
            this.baseArea = baseArea;
            this.height = height;
            this.weight = weight;
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] DP = new int[n];
        List<Block> blocks = new ArrayList<>();
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int baseArea = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            blocks.add(new Block(baseArea, height, weight));
        }
        Collections.sort(blocks,(o1,o2)->o1.weight - o2.weight);

        DP[0] = blocks.get(0).height;
        for(int i=1; i<n; i++) {
            int maxHeight = -1;
            for(int j=i-1; j>=0; j--) {
                if(DP[j] > maxHeight && blocks.get(j).baseArea<blocks.get(i).baseArea) {
                    maxHeight = DP[j];
                    DP[i] = DP[j]+blocks.get(i).height;
                }
            }
            if(DP[i]==0) DP[i] = blocks.get(i).height;
        }

        System.out.println(Arrays.stream(DP).max().getAsInt());
    }
}
