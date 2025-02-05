package DFSBFS.바둑이승차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int maxKG = -1;
    static int standKG ;
    static int n;
    public static void DFS(int[] arr, int L, int kg){
        if(kg >= standKG) return;
        if(L==n) maxKG = Math.max(maxKG, kg);
        else if(L<n) {
            DFS(arr, L+1, kg + arr[L+1]);
            DFS(arr, L+1, kg);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        standKG = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        for(int i=1;i<=n;i++) arr[i] = Integer.parseInt(br.readLine());
        DFS(arr,0,0);
        System.out.println(maxKG);
    }
}
