package br.com.sauerbronn.example.stack;

public class SimpleStack implements StackInterface<String> {
    private String[] stack;
    private int top;
    private int capacity;

    public SimpleStack(int size) {
        stack = new String[size];
        capacity = size;
        top = -1;
    }

    @Override
    public void push(String item) {
        if (top == capacity - 1) {
            throw new StackOverflowError("Stack is full");
        }
        stack[++top] = item;
    }

    @Override
    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top--];
    }

    @Override
    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }
    
}
