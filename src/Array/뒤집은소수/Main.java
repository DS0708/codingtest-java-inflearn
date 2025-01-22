package Array.뒤집은소수;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int max = 100000;
    static int[] num = new int[max+1];

    boolean isPrime(int n){
        return num[n]==0?true:false;
    }

    public void getPrime(){
        num[0] = 1;
        num[1] = 1;
        for(int i=2; i<=max; i++){
            if(num[i]==1) continue;
            for(int j=i*2; j<=max; j+=i) num[j]=1;
        }
    }

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        getPrime();

        for(int i=0; i<n; i++){
            String str = String.valueOf(arr[i]);
            int tmp = Integer.parseInt(new StringBuilder(str).reverse().toString());
            if(isPrime(tmp)) answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        for(int x: T.solution(n,arr)) System.out.print(x+" ");
    }
}
