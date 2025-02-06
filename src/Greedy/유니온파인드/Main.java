package Greedy.유니온파인드;

import java.io.*;
import java.util.*;

public class Main {
    static int[] unf;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        unf = new int[n+1];
        for(int i=1; i<=n; i++) unf[i] = i;
        int m = Integer.parseInt(st.nextToken());
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int f1 = Integer.parseInt(st.nextToken());
            int f2 = Integer.parseInt(st.nextToken());
            union(f1,f2);
        }
        st = new StringTokenizer(br.readLine());
        int f1 = Integer.parseInt(st.nextToken());
        int f2 = Integer.parseInt(st.nextToken());
        if(find(f1)==find(f2)) System.out.println("YES");
        else System.out.println("NO");
    }
    public static void union(int f1, int f2){
        int a = find(f1);
        int b = find(f2);
        if(a!=b) unf[b] = a;
    }
    public static int find(int n){
        if(n==unf[n]) return n;
        else return unf[n]=find(unf[n]);
    }
}
