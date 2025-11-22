public class Stack_using_Array{

    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack_using_Array(int size)
    {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // stack is empty
    }

    public void push(int value)
    {
        if (top == maxSize - 1)
        {
            System.out.println("Stack is full");
            return;
        }
        stackArray[++top] = value;

        // top = top + 1;
        // stackArray[top] = value;
    }

    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top--];

        // int returnValue = stackArray[top];
        // top = top - 1;
        // return returnValue;
    }

    public int peek()
    {
        if (isEmpty()) return -1;
        return stackArray[top];
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public int size()
    {
        return top + 1;
    }
}