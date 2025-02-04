package RecursiveTreeGraph.이진트리순회DFS;

public class Main {
    static class Node{
        int data;
        Node lt,rt;
        public Node(int data){
            this.data = data;
            lt=rt=null;
        }
    }

    public static void DFS_Preorder(Node node){
        System.out.print(node.data + " ");
        if(node.lt!=null) DFS_Preorder(node.lt);
        if(node.rt!=null) DFS_Preorder(node.rt);
    }
    public static void DFS_Inorder(Node node){
        if(node.lt!=null) DFS_Inorder(node.lt);
        System.out.print(node.data + " ");
        if(node.rt!=null) DFS_Inorder(node.rt);
    }
    public static void DFS_Postorder(Node node){
        if(node.lt!=null) DFS_Postorder(node.lt);
        if(node.rt!=null) DFS_Postorder(node.rt);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.lt=new Node(2);
        root.rt=new Node(3);
        root.lt.lt=new Node(4);
        root.lt.rt=new Node(5);
        root.rt.lt=new Node(6);
        root.rt.rt=new Node(7);

        System.out.print("전위순회 : ");
        DFS_Preorder(root);
        System.out.print("\n중위순회 : ");
        DFS_Inorder(root);
        System.out.print("\n후위순회 : ");
        DFS_Postorder(root);
    }
}
