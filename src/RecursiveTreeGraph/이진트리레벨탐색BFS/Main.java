package RecursiveTreeGraph.이진트리레벨탐색BFS;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static class Node{
        int data;
        Node lt,rt;
        public Node(int data){
            this.data = data;
            lt=rt=null;
        }
    }

    public static void BFS(Node root){
        Queue<Node> Q = new ArrayDeque<>();
        Q.offer(root);

        while(!Q.isEmpty()){
            Node cur = Q.poll();
            System.out.print(cur.data+" ");
            if(cur.lt!=null) Q.offer(cur.lt);
            if(cur.rt!=null)  Q.offer(cur.rt);
        }
    }

    public static void BFS_level(Node root){
        Queue<Node> Q = new ArrayDeque<>();
        Q.offer(root);
        int level = 0;
        while(!Q.isEmpty()){
            int size = Q.size();
            System.out.print(level + " : ");
            for(int i=0; i<size; i++){
                Node cur = Q.poll();
                System.out.print(cur.data+" ");
                if(cur.lt!=null) Q.offer(cur.lt);
                if(cur.rt!=null) Q.offer(cur.rt);
            }
            level++;
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Node root=new Node(1);
        root.lt=new Node(2);
        root.rt=new Node(3);
        root.lt.lt=new Node(4);
        root.lt.rt=new Node(5);
        root.rt.lt=new Node(6);
        root.rt.rt=new Node(7);
        BFS(root);
        System.out.println("\n 레벨까지 출력");
        BFS_level(root);
    }
}
