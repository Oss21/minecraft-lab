package model;

public class Stack<T> implements IStack<T>{

    private int size;
    public Node<T> nodeTop;

    public Stack(){}


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void setSize(int size) {

    }

    @Override
    public void push(Node<T> node) {

    }

    @Override
    public Node<T> peek() {
        return null;
    }

    @Override
    public Node<T> pop() {
        return null;
    }
}
