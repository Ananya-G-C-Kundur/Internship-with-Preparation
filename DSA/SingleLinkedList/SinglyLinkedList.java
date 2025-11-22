public class SinglyLinkedList {

    Node head;
    
    public SinglyLinkedList()
    {
        this.head = null;
        System.out.println("Singly linked list object created");
    }

    // It doesnot matter whether thier are any nodes or not
    // We can set next to current head
    // Make the new as current head
    public void insert_at_the_begining(int data)
    {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void insert_at_the_end(int data)
    {
        Node newNode = new Node(data);
        if (this.head == null)
        {
            this.head = newNode;
            System.out.println("List was empty , made the new node as head");
            return;
        }

        Node currentNode = this.head;
        while (currentNode.next != null)
        {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
        newNode.next = null;
        System.out.println("Inserted the node at the end");
    }

    public void insert_at_the_position(int data, int target_position)
    {
        if(target_position <= 0)
        {
            System.out.println("Invalide Position" +target_position);
            return;
        }

        if(target_position == 1)
        {
          this.insert_at_the_begining(data);
          return;  
        }

        Node currentNode = this.head;
        int currentPosition = 1;

        while (currentPosition < target_position - 1)
        {
            if(currentNode == null)
            {
                break;
            }
            currentNode = currentNode.next;
            currentPosition = currentPosition + 1;
        }

        if(currentNode == null)
        {
            System.out.println("Invalide Position");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    public void Delete_at_biginning()
    {
        // List empty
        if (this.head == null)
        {
            System.out.println("Invalide operation List is empty");
            return;
        }

        // List has only one or more nodes , when u delete that node list becomes empty
        this.head = this.head.next;
        System.out.println("Deleted the node from the list");
    }

    public void Delete_at_end()
    {
        // List is empty
        if (this.head == null)
        {
            System.out.println("Invalide operation List is empty");
            return;
        }

        // List has one node , when u delete that node , List becomes empty
        if (this.head.next == null)
        {
            this.head = null;
            System.out.println("Node is deleted");
            return;
        }

        // Two or more nodes
        Node currentNode = this.head;

        // while (currentNode != null)  [WORNG]  -- we will reach end of the list till null
        // while (currentNode.next != null) [WRONG] -- we will reach the last node which we want to delete

        while (currentNode.next.next != null) // we will reach one node before the last node
        {
            currentNode = currentNode.next;
        }

        // delete operation
        currentNode.next = null;

        System.out.println("Deleted the node at end");
    }

    public void delete_At_given_position(int deletePosition)
    {
        if (this.head == null)
        {
            System.out.println("List is empty");
            return;
        }

        if (deletePosition <= 0)
        {
            System.out.println("Invalide delete position" +deletePosition);
            return;
        }

        if (deletePosition == 1 && this.head.next == null)
        {
            // There is only one node and we are trying to delete
            this.head = null;
            return;
        }

        int currentPosition = 1;
        Node currentNode = this.head;

        while (currentPosition < deletePosition-1) 
        {
            currentNode = currentNode.next;
            currentPosition +=1;

            if (currentNode == null)  // This happens only on invalide input of delete position
            {
                break;
            }
        }

        if (currentNode == null)
        {
            System.out.println("Invalide Target Position for deleting");
            return;
        }

        currentNode.next = currentNode.next.next;
    }

    public void serach(int key)
    {
        if (this.head == null)
        {
            System.out.println("List is Empty");
            return;
        }

        Node currentNode = this.head;

        while (currentNode != null)
        {
            if (currentNode.data == key)
            {
                System.out.println("Key is found in the list");
                return;
            }
            currentNode = currentNode.next;
        }
        System.out.println("key is NOT found in the list");
    }

    public int countKey(int key)
    {
        int count = 0;
        if (this.head == null)
        {
            System.out.println("List is Empty");
            return count;
        }

        Node currentNode = this.head;
        while (currentNode != null)
        {
            if (currentNode.data == key)
            {
                count++;
            }
            currentNode = currentNode.next;
        }
        return count;
    }

    public void Print_all_NodesData()
    {
        if (this.head == null)
        {
            System.out.println("List is Empty");
            return;
        }

        System.out.println("Nodes in the List");

        Node currentNode = this.head;

        while (currentNode != null)
        {
            System.out.print(" " +currentNode.data + "--->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void test_Delete_at_Position()
    {
        // Empty list
        this.delete_At_given_position(0);
        this.delete_At_given_position(-1);

        this.insert_at_the_begining(1);
        this.delete_At_given_position(10);

        this.delete_At_given_position(1);

        this.insert_at_the_begining(4);
        this.insert_at_the_begining(3);
        this.insert_at_the_begining(2);
        this.insert_at_the_begining(1);

        this.delete_At_given_position(3);
    }

    public void testAllOperations()
    {
        this.Delete_at_biginning();
        this.Delete_at_end();

        this.insert_at_the_begining(1);
        this.Delete_at_biginning();

        this.insert_at_the_begining(1);
        this.Delete_at_end();
        
        this.insert_at_the_begining(1);
        this.insert_at_the_begining(2);
        this.insert_at_the_begining(3);

        this.Print_all_NodesData();

        this.insert_at_the_end(4);
        this.insert_at_the_end(5);

        this.Print_all_NodesData();

        this.Delete_at_biginning();
        this.Print_all_NodesData();

        this.Delete_at_end();
        this.Print_all_NodesData();

        this.serach(100);
        this.serach(4);

        this.countKey(1);

    }

    public void testInsert_at_position()
    {
        // Empty list but position values are invalid
        this.insert_at_the_position(1, -1);
        this.insert_at_the_position(1, 0);

        // List has one node , we are performing insert at start
        this.insert_at_the_begining(10);
        this.insert_at_the_position(20, 1);

        this.insert_at_the_position(3, 3);
        this.insert_at_the_position(10, 10);


    }
}
