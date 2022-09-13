package stacks;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    static int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public void push(int ele){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }

        ptr++;
        data[ptr] = ele;
    }

    public int pop( ){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        int popped = data[ptr];
        ptr --;
        return popped;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        return data[ptr];
    }

    private boolean isEmpty() {
        return ptr == -1;
    }

    private boolean isFull() {
        return ptr == data.length-1;
    }
}
