public class Queue{

    Node rear, front;

    public Queue()
    {
        this.rear = this.front = null;
    }

    public void Enqueue(int data)
    {
        Node newNode = new Node(data);

        System.out.println("Adding element to the queue " + data);

        // Queue empty
        if (this.rear == null)
        {
            this.rear = this.front = newNode;
            return;
        }

        // There are one or more elements in Queue
        this.rear.next = newNode;
        this.rear = newNode;
    }

    public int Dequeue()
    {
        // Queue Empty
        if (this.front == null)
        {
            System.out.println("Queue is Empty");
            return -1;
        }

        // One or more node
        int data = this.front.data;
        this.front = this.front.next;

        if (this.front == null)
        {
            this.rear = null;
        }

        return data;
    }

    public int Peek()
    {
        if (this.front == null)
        {
            return -1;
        }
        else
        {
            return this.front.data;
        }
    }

    public boolean IsEmpty()
    {
        if (this.front == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void PrintAllNodes()
    {
        if (this.front == null)
        {
            System.out.println("Queue is empty");
            return;
        }

        Node currentNode = this.front;

        while (currentNode != null)
        {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public void testQueueOperations()
    {
        this.Dequeue();

        System.out.println("The peek element is " +this.Peek());

        this.Enqueue(1);
        this.Enqueue(2);
        this.Enqueue(3);

        this.Peek();

        this.PrintAllNodes();

        System.out.println("Removed the elements from queue " +this.Dequeue());
        System.out.println("Removed the elements from queue " +this.Dequeue());
        System.out.println("Removed the elements from queue " +this.Dequeue());
        System.out.println("Removed the elements from queue " +this.Dequeue());
    }
}