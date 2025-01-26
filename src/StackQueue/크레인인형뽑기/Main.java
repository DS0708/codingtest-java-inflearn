package StackQueue.크레인인형뽑기;

import java.util.*;

public class Main {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int col : moves){
            for(int row=1; row<board.length; row++){
                if(board[row][col]!=0){
                    int doll = board[row][col];
                    if(!stack.isEmpty() && stack.peek()==doll){
                        answer += 2;
                        stack.pop();
                    }else{
                        stack.push(doll);
                    }
                    board[row][col]=0;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] board = new int[n+1][n+1];
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                board[i][j] = scanner.nextInt();
            }
        }
        int move = scanner.nextInt();
        int[] moves = new int[move];
        for(int i = 0; i < move; i++) moves[i] = scanner.nextInt();

        System.out.println(T.solution(board, moves));
    }
}
