package DFSBFS.동전교환;

import java.util.*;

public class Main {
    static int n,change;
    static Integer[] coins;
    static int answer = Integer.MAX_VALUE;
    public static void DFS(int num, int money){
        if(num >= answer) return;
        if(money > change) return;
        else if (money==change) answer = Math.min(num,answer);
        else{
            for(int i=0; i<coins.length; i++) DFS(num+1,money+coins[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        coins = new Integer[n];
        for(int i = 0; i < n; i++) coins[i] = scanner.nextInt();
        Arrays.sort(coins,Collections.reverseOrder());
        change = scanner.nextInt();
        DFS(0,0);
        System.out.println(answer);
    }
}
