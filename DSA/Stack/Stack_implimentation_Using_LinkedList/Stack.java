public class Stack {
    
    Node top;
    int count;

    public Stack()
    {
        this.top = null;
        this.count = 0;
    }

    public void Push(int data)
    {
        Node newNode = new Node(data);
        this.count++;

        // stack Empty
        if (this.top == null)
        {
            this.top = newNode;
            return;
        }

        // Stack has some elements
        newNode.next = this.top;
        this.top = newNode;
    }

    public int pop()
    {
        // Stack empty
        if (this.top == null)
        {
            System.out.println("Stack is empty");
            return -1;
        }

        // More then one element
        int value = this.top.data;
        this.top = this.top.next;
        this.count--;

        return value;
    }

    public int getCount()
    {
        return this.count;
    }

    public int peek()
    {
        // stack empty
        if (this.top == null)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            return this.top.data;
        }
    }

    public void PrintAll()
    {
        // Stack empty
        if (this.top == null)
        {
            System.out.println("Stack is empty");
            return;
        }

        Node currentNode = this.top;

        while (currentNode != null)
        {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public void testStack()
    {
        this.pop();
        this.PrintAll();
        System.out.println("Number of elements in the stack =" +this.getCount());
        
        this.Push(10);
        this.Push(20);
        this.Push(30);

        this.PrintAll();
        System.out.println("The peek element is = " +this.peek());
        System.out.println("Number of elements in the stack =" +this.getCount());
       
        this.pop();
        this.pop();
        this.pop();
        this.pop();
    }
}
