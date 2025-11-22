public class CircularList {

    Node tail;

    public CircularList()
    {
        this.tail = null;
    }

    public void InsertAtTail(int data)
    {
        Node newNode = new Node(data);

        // List is empty
        if (this.tail == null)
        {
            newNode.next = newNode;
            this.tail = newNode;
            return;
        }

        // List has one or more elements
        newNode.next = this.tail.next;
        this.tail.next = newNode;
        this.tail = newNode;
    }

    public void InsertAtStart(int data) 
    {
        Node newNode = new Node(data);

        // Empty list
        if (this.tail == null)
        {
            newNode.next = newNode;
            this.tail = newNode;
            return;
        }

        // List has one or more nodes
        newNode.next = tail.next;
        tail.next = newNode;
    }

    public void DeleteAtTail()
    {
        // List is empty
        if (this.tail == null)
        {
            System.out.println("List is empty");
            return;
        }

        // If their is only one node
        if (this.tail.next == this.tail)
        {
            this.tail = null;
            return;
        }

        // If thier are two or more nodes
        Node newTail = this.tail.next;

        while (newTail.next != this.tail)
        {
            newTail = newTail.next;
        }

        newTail.next = this.tail.next;
        this.tail = newTail;
    }

    public void DeleteAtStart()
    {
        // List is empty
        if (this.tail == null)
        {
            System.out.println("List is empty");
            return;
        }

        // If their is only one node
        if (this.tail.next == this.tail)
        {
            this.tail = null;
            return;
        }

        // Two or more Nodes
        tail.next = tail.next.next;
    }

    public void Search(int key)
    {
        boolean isKeyFound = false;

        // Empty List
        if (this.tail == null)
        {
            System.out.println("List is Empty");
            return;
        }

        // List has one or more nodes
        Node currentNode = this.tail.next;

        //System.out.println("Node in the list are .. \n");

        while (true)
        {
            //System.out.print(" " + currentNode.data + " ---> ");
            if (key == currentNode.data)
            {
                // System.out.println("Key is found");
                // return;

                isKeyFound = true;
                break; // Stop searching when the key is found
            }

            currentNode = currentNode.next;

            if (currentNode == tail)
            {
                //System.out.print(" " + currentNode.data + " ---> ");
                if (currentNode.data == key)
                {
                    // System.out.println("Key is found");
                    // return;

                    isKeyFound = true;
                }
                break; // Terminating the loop
            }
        }

        if (isKeyFound == true)  // if (isKeyFound)
        {
            System.out.println(" \n Key is found");
        }
        else
        {
            System.out.println(" \n Key is not found");
        }
        
        // System.out.println("Key is not found");
    }

    public void PrintList()
    {

        // Empty List
        if (this.tail == null)
        {
            System.out.println("List is Empty");
            return;
        }

        // List has one or more nodes
        Node currentNode = this.tail.next;

        System.out.println("\n Node in the list are .. \n");

        while (true)
        {
            System.out.print(" " + currentNode.data + " ---> ");
            currentNode = currentNode.next;

            if (currentNode == tail)
            {
                System.out.print(" " + currentNode.data + " ---> ");
                break;
            }
        }
    }

    public void TestCircularList()
    {
        //this.PrintList();

        this.InsertAtStart(1);
        this.InsertAtStart(3);
        this.InsertAtStart(4);
        //this.PrintList();

        this.InsertAtTail(2);
        this.PrintList();

        Search(3);

        DeleteAtTail();
        PrintList();

        DeleteAtStart();
        PrintList();
        
    }
}
