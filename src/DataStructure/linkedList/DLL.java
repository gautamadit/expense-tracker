package DataStructure.linkedList;

class Node {
    Node prev;
    char data;
    Node next;
    Node(char data){
        this.prev=null;
        this.data = data;
        this.next = null;
    }
}
public class DLL {
    private Node head;
    DLL(){
        head = null;
    }
    void insertAtHead(char val){
        Node n = new Node(val);
        n.next = head;
        head = n;
    }
    void insertAtTail(char val){
        Node n = new Node(val);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = n;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    void makeCircular(int n) {
        if (head == null) return;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head.prev = temp;
        while(n-->0){
            head=head.next;
            temp=temp.next;
        }
        head.prev =null;
        temp.next=null;

    }


}
class code{
    public static void main(String[] args){
        DLL LL=new DLL();
        LL.insertAtHead('a');
        LL.insertAtHead('b');
        LL.insertAtHead('c');
        LL.insertAtHead('d');
        LL.insertAtTail('e');
        LL.display();
        LL.makeCircular(3);
        LL.display();
    }
}