public class Stack_Application {
    public static void main(String[] args) {

        Stack_using_Array stack = new Stack_using_Array(5);

        System.out.println("Pushing elements...");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());

        System.out.println("Popping elements...");
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        System.out.println("Current top: " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);  // this should show "Stack is full"

        System.out.println("Final top: " + stack.peek());
        System.out.println("Final size: " + stack.size());
    }
}
