public class q2{
    private int[] array;
    private int top;
    private int size;
    
    public q2(int size) {
        this.array = new int[size];
        this.top = -1;
        this.size = size;
    }
    
    public void push(int element) throws StackFullException {
        if (top == size - 1) {
            throw new StackFullException("Stack is full");
        }
        array[++top] = element;
    }
    
    public int pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty");
        }
        return array[top--];
    }
    
    public static void main(String[] args) {
        q2 stack = new q2(5);
        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
           
        } catch (StackFullException | StackEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}

class StackFullException extends Exception {
    public StackFullException(String errorMessage) {
        super(errorMessage);
    }
}

class StackEmptyException extends Exception {
    public StackEmptyException(String errorMessage) {
        super(errorMessage);
    }
}