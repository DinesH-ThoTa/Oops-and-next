package stacks;

public class Main {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(10);
        stack.peek();
        stack.push(12);
        System.out.println(stack.pop());
    }
}
