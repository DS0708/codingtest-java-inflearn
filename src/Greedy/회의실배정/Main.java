package Greedy.회의실배정;

import java.util.*;

public class Main {
    public static class Meeting{
        int start;
        int end;
        public Meeting(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Meeting> meetings = new ArrayList<>();
        for(int i = 0; i < n; i++) meetings.add(new Meeting(scanner.nextInt(), scanner.nextInt()));
        Collections.sort(meetings,(o1,o2)->{
           if(o1.end==o2.end) return o1.start-o2.start;
           else return o1.end-o2.end;
        });
        int answer = 0;
        int curEndTime = 0;
        for(Meeting meeting : meetings) {
            if(meeting.start >= curEndTime) {
                curEndTime = meeting.end;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
