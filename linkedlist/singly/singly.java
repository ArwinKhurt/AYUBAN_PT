package repo.linkedlist.singly;

class Node {
    int data;
    Node next; 
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class singly {
    private Node head;

    public singly() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) { 
                temp = temp.next;
            }
            temp.next = newNode; 
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        singly list = new singly();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Singly Linked List:");
        list.display();
    }
}
