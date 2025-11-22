public class DoubleLinkedList {
    Node head;

    public DoubleLinkedList()
    {
        this.head = null;
    }

    public void InsertAtBeginning(int data)
    {
        Node newNode = new Node(data);

        //zero node's (List is empty)
        if (this.head == null)
        {
            this.head = newNode;
            return;
        }

        // one Node or Multiple Node's (There are one or more nodes)
        newNode.next = this.head; //Connect the new node’s next pointer to the current first node.
        this.head.prev = newNode; // Make the current first node’s prev point back to the new node.
        this.head = newNode; //Move the head pointer to the new node — now it becomes the first node.
    }

    public void InsertAtEnd(int data)
    {
        Node newNode = new Node(data);

        //List is empty (Zero node's)
        if (this.head == null)
        {
            this.head = newNode;
            return;
        }

        // List has one or more node's
        Node lastNode = this.head;

        while (lastNode.next != null)
        {
            lastNode = lastNode.next;
        }

        //lastNode.next == null 
        // append the newNode to the lastNode
        lastNode.next = newNode;
        newNode.prev = lastNode;
    }

    public void InsertAtPosition(int data , int targetPosition)
    {
        if (targetPosition <= 0)
        {
            System.out.println("Invalide position");
            return;
        }

        if(this.head == null && targetPosition == 1)
        {
            this.InsertAtBeginning(data);
            return;
        }

        Node leftNode = this.head;
        int currentPosition = 1;

        while (currentPosition < targetPosition - 1)
        {
            if (leftNode == null)
            {
                System.out.println("Invalide target position, it's more than the number of nodes");
                return;
            }

            leftNode = leftNode.next;
            currentPosition = currentPosition+1;
        }

        // leftNode is now one step away from the node with position in whichwe want to insert a node
        Node newNode = new Node(data);
        if (leftNode.next == null)
        {
            // case when new node is added at the end
            leftNode.next = newNode;
            newNode.prev = leftNode;
        }
        else
        {
            // Case when new node is added in between
            newNode.next = leftNode.next;
            newNode.prev = leftNode;
            leftNode.next.prev = newNode;
            leftNode.next = newNode;
        }
    }

    public void printAllNodes()
    {
        // List is empty
        if (this.head == null)
        {
            System.out.println("List is empty !");
            return;
        }

        Node currentNode = this.head;
        System.out.println("Node is the list are !");

        while (currentNode != null)
        {
            System.out.print(" " + currentNode.data + " <---> ");
            currentNode = currentNode.next;
        }
        System.out.println("\n");
    }

    public void printAllNodesReverseOrder()
    {
        // List is Empty
        if (this.head == null)
        {
            System.out.println("List is empty !");
            return;
        }

        Node currentNode = this.head;
        System.out.println("Nodes in the list are !");
        while (currentNode.next != null)
        {
            System.out.print(" " + currentNode.data + " <---> ");
            currentNode = currentNode.next;
        }
        System.out.print(" " + currentNode.data + " <---> ");
        System.out.println("\n");

        System.out.println("reverse order : ");
        while (currentNode.prev != null)
        {
            System.out.print(" " + currentNode.data + " <---> ");
            currentNode = currentNode.prev;
        }
        // Print the head node
        System.out.print(" " + currentNode.data + " <---> ");
        System.out.println("\n");
    }

    public void search(int key)
    {
        // List is empty
        if (this.head == null)
        {
            System.out.println("List is empty !");
            return;
        }

        Node currentNode = this.head;
        System.out.println("Nodes in the list are !");
        while (currentNode != null)
        {
            if (key == currentNode.data)
            {
                // Key is found
                System.out.println("Key is found");
                return;
            }
            currentNode = currentNode.next;
        }
        System.out.println("Key is NOT found !");
    }

    public void deleteAtBeginning()
    {
        // List is empty
        if (this.head == null)
        {
            System.out.println("List is empty !");
            return;
        }

        //Single node , list become empty
        if (this.head.next == null)
        {
            this.head = null;
            return;
        }

        // Two or more nodes
        this.head = this.head.next;
        this.head.prev = null;
    }

    public void deleteAtEnd()
    {
        // List is empty
        if (this.head == null)
        {
            System.out.println("List is empty !");
            return;
        }

        // Single node , list become empty
        if (this.head.next == null)
        {
            this.head = null;
            return;
        }

        // Two or more nodes
        Node lastNode = this.head;
        while (lastNode.next.next == null)
        {
            lastNode = lastNode.next;
        }
        lastNode.next = null;
    }

    public void deleteAtPosition(int targetPosition)
    {
        if (targetPosition <= 0)
        {
            System.out.println("Invalide position");
            return;
        }

        if (this.head == null)
        {
            System.out.println("List is empty");
            return;
        }

        if (this.head.next == null && targetPosition == 1)
        {
            this.head = null;
            return;
        }

        int currentPosition = 1;
        Node delNode = this.head;

        while (currentPosition < targetPosition - 1)
        {
            currentPosition = currentPosition + 1;
            delNode = delNode.next;

            if (delNode == null)
            {
                System.out.println("Invalide position");
                return;
            }
        }

        if (delNode.next == null)
        {
            System.out.println("can't perform this operation");
            return;
        }

        if (delNode.next.next == null)
        {
            // delNode becomes the new last node
            delNode.next = null;
            return;
        }

        delNode.next = delNode.next.next;
        delNode.next.prev = delNode;
    }
    
    public void testInsertOperations()
    {
        this.InsertAtBeginning(10);
        this.InsertAtBeginning(5);
        this.printAllNodes();
        this.InsertAtEnd(90);
        this.InsertAtEnd(100);
        this.printAllNodes();

        this.InsertAtPosition(3, -1);
        printAllNodes();

        this.InsertAtPosition(2, 5);
        printAllNodes();

        this.printAllNodesReverseOrder();
    }

    public void testDeleteOperations()
    {
        this.deleteAtBeginning();
        printAllNodes();
    }
}
