public class Node {

    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;

        System.out.println(("A new node has been created with data = " + this.data));
    }
}