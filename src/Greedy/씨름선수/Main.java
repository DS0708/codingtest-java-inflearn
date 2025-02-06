package Greedy.씨름선수;

import java.util.*;

public class Main {
    static class Player{
        int height;
        int weight;
        public Player(int height, int weight){
            this.height = height;
            this.weight = weight;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Player> players = new ArrayList<>();
        for(int i=0; i<n; i++) players.add(new Player(scanner.nextInt(), scanner.nextInt()));
        int answer = 1;
        Collections.sort(players, (o1, o2) -> {
            return o2.height - o1.height;
        });
        int maxWeight = players.get(0).weight;
        for(int i=1; i<players.size(); i++){
            if(players.get(i).weight >= maxWeight){
                answer ++;
                maxWeight = players.get(i).weight;
            }
        }
        System.out.println(answer);
    }
}
