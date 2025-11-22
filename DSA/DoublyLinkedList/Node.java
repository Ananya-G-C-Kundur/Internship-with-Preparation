public class Node{

    int data;
    Node next;
    Node prev;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;


        System.out.println("A new node has been created with data = " +this.data);
    }
}