package StackQueue.응급실;

import java.util.*;

public class Main {
    static class Person{
        int no;
        int priority;
        Person(int no,int priority){
            this.no=no;
            this.priority=priority;
        }
    }

    public int solution(int[] arr, int m) {
        int answer = 1;
        Queue<Person> Q = new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            Q.offer(new Person(i,arr[i]));
        }

        while(!Q.isEmpty()){
            Person p = Q.poll();
            boolean check = true;
            for(Person tmp : Q){
                if(p.priority < tmp.priority){
                    Q.offer(p);
                    check = false;
                    break;
                }
            }
            if(check && p.no==m){
                break;
            }
            if(check) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        System.out.println(T.solution(arr,m));
    }
}
