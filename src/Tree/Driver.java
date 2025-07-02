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

class BinarySearch {
    private Node root;

    BinarySearch() {
        root = null;
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    void insert(int data) {
        root = insertRec(root, data);
    }

    void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private boolean searchRec(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (data == root.data) {
            return true;
        }
        if (data < root.data) {
            return searchRec(root.left, data);
        } else {
            return searchRec(root.right, data);
        }
    }

    boolean search(int key) {
        return searchRec(root, key);
    }
}

public class Driver {
    public static void main(String[] args) {
        BinarySearch bst = new BinarySearch();
        bst.insert(50);
        bst.insert(100);
        bst.insert(150);

        bst.inOrderTraversal(); // Should print: 50 100 150
        System.out.println();

        int key = 3;
        System.out.println(bst.search(key));  // Should print: false
    }
}

