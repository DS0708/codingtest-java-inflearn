package Greedy.최대수입스케쥴;

import java.util.*;

public class Main {
    public static class Lecture{
        int money;
        int day;
        public Lecture(int money, int day){
            this.money = money;
            this.day = day;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Lecture> lectures = new ArrayList<>();
        for(int i=0; i<n; i++) lectures.add(new Lecture(scanner.nextInt(), scanner.nextInt()));
        Collections.sort(lectures,(o1,o2)->o2.day-o1.day);
        int maxDay = lectures.get(0).day;
        PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        int idx = 0;
        for(int i=maxDay; i>0; i--){
            for(; idx<lectures.size(); idx++){
                if(lectures.get(idx).day < i) break;
                PQ.add(lectures.get(idx).money);
            }
            if(!PQ.isEmpty()) answer += PQ.poll();
        }

        System.out.println(answer);
    }
}
