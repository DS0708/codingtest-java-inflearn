package Greedy.결혼식;

import java.io.*;
import java.util.*;

public class Main {
    public static class Time{
        char type;
        int val;
        public Time(char type, int val){
            this.type = type;
            this.val = val;
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<Time> times = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            times.add(new Time('s', Integer.parseInt(st.nextToken())));
            times.add(new Time('e', Integer.parseInt(st.nextToken())));
        }
        Collections.sort(times,(o1,o2)->{
           if(o1.val == o2.val) return o1.type - o2.type;
           else return o1.val - o2.val;
        });
        int people = 0;
        int answer = 0;
        for(Time time:times){
            if(time.type == 's'){
                people ++;
                answer = Math.max(answer, people);
            }else{
                people--;
            }
        }
        System.out.println(answer);
    }
}
