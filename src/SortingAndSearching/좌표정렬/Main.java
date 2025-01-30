package SortingAndSearching.좌표정렬;

import java.util.*;

public class Main{
    static class Point implements Comparable<Point>{
        int x;
        int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Point o){
            if(this.x == o.x) return this.y - o.y;
            else return this.x - o.x;
        }
    }

    public List<Point> solution(List<Point> list) {
        Collections.sort(list);

        return list;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Point> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(new Point(scanner.nextInt(), scanner.nextInt()));
        for(Point p : T.solution(list)) System.out.println(p.x+" "+p.y);
    }
}
