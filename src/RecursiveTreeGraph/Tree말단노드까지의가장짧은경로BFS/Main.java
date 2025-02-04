package RecursiveTreeGraph.Tree말단노드까지의가장짧은경로BFS;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static class Node {
        int val;
        Node lt, rt;
        public Node(int val) {
            this.val = val;
            lt=rt=null;
        }
    }
    public static int BFS(Node root) {
        int level = 0;
        Queue<Node> Q = new ArrayDeque<>();
        Q.offer(root);
        while(!Q.isEmpty()) {
            Node cur = Q.poll();
            int size = Q.size();
            for(int i = 0; i < size; i++) {
                if(cur.lt==null && cur.rt==null) return level+1;
                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
            }
            level++;
        }
        return level;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        //자식을 두개 다 가지거나 안가지는 노드만 존재할 때 가능
        System.out.println(BFS(root));
    }
}
