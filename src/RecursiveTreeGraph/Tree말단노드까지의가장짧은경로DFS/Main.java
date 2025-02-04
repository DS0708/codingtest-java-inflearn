package RecursiveTreeGraph.Tree말단노드까지의가장짧은경로DFS;

public class Main {
    static class Node {
        int val;
        Node lt, rt;
        public Node(int val) {
            this.val = val;
            lt=rt=null;
        }
    }
    public static int DFS(int L, Node root) {
        if(root.lt==null && root.rt==null) return L;
        else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        //자식을 두개 다 가지거나 안가지는 노드만 존재할 때 가능
        System.out.println(DFS(0,root));
    }
}
