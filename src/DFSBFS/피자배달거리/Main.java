package DFSBFS.피자배달거리;

import java.util.*;

public class Main {
    static int n,m;
    static int answer = Integer.MAX_VALUE;
    static List<int[]> houseList;
    static List<int[]> pizzaList;
    static int[] combi;

    public static void DFS(int L, int s){
        if(L==m) {
            int sum = 0;
            for(int[] house : houseList) {
                int dis = Integer.MAX_VALUE;
                for(int i=0; i<m; i++){
                    dis = Math.min(dis, Math.abs(house[0] - pizzaList.get(combi[i])[0]) + Math.abs(house[1] - pizzaList.get(combi[i])[1]));
                }
                sum+=dis;
            }
            answer = Math.min(sum, answer);
        }
        else{
            for(int i=s; i<pizzaList.size(); i++){
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        houseList = new ArrayList<>();
        pizzaList = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                int tmp = scanner.nextInt();
                if(tmp==1) houseList.add(new int[]{i,j});
                else if(tmp==2) pizzaList.add(new int[]{i,j});
            }
        }
        combi = new int[m];
        DFS(0,0);
        System.out.println(answer);
    }
}

