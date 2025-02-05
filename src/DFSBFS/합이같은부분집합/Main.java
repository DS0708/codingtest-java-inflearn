package DFSBFS.합이같은부분집합;

import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static String answer = "NO";
    static int total = 0;
    static boolean flag = false;
    public static void DFS(int node, int sum, int[] arr){
        if(sum*2 > total) return;
        if(flag) return;
        if(node == n) {
            if(sum*2 == total){
                answer = "YES";
                flag = true;
            }
            return;
        }else{
            DFS(node+1, sum+arr[node], arr);
            DFS(node+1, sum, arr);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] split = br.readLine().split(" ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(split[i]);
            total += arr[i];
        }
        DFS(0,0,arr);
        System.out.println(answer);
    }
}
