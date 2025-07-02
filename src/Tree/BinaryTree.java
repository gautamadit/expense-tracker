//package Tree;
//
//import static Tree.Node.DFS;
//
//class Node{
//    int data;
//    Node left;
//    Node right;
//
//    Node(int data){
//        this.data=data;
//        this.left=null;
//        this.right=null;
//
//    }
// static void DFS(Node root){
//        if(root==null){
//            return;
//        }
//
//        DFS(root.left);
//
//
//
//     System.out.print(root.data+" ");
// }
//}
//
//public class BinaryTree {
//   static Node createNode(int val){
//        Node n=new Node(val);
//        return n;
//    }
//    public static void main(String[] args){
//        Node root=createNode(1);
//        root.left=createNode(2);
//        root.right=createNode(3);
//        root.left.left=createNode(4);
//        root.left.right=createNode(5);
//        root.right.left=createNode(6);
//        root.right.right=createNode(7);
//        root.left.right.left=createNode(8);
//        root.right.left.left=createNode(15);
//        root.right.left.right=createNode(9);
//        DFS(root);
//    }
//
//}
