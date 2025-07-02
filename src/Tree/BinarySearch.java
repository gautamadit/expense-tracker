package Tree;



class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;

    }
}
class BinarySearch{
    Node root;
    BinarySearch(){
        root=null;
    }
    private Node insertRec(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=insertRec(root.left,data);
        } else if (data> root.data) {
          root.right=insertRec(root.right,data);
        }
        return root;
    }
    void insert(int data){
        root=insertRec(root,data);
    }
}
 class driver{
    public static void main(String[]args){
        BinarySearch n=new BinarySearch();
        n.insert(50);
        n.insert(100);
        n.insert(150);
    }
 }
