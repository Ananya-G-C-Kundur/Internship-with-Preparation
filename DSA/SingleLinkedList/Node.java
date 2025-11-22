public class Node {

    int data;
    Node next;   //Reference
    public Node(int data)
    {
        this.data = data;
        this.next = null;

        System.out.println("New node has been created with data = " +this.data);
    }
}
