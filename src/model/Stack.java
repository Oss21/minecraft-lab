package model;

public class Stack<T> implements IStack<T>{

    private Cube<T> top;
    private int size;

    public Stack() {
        top = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void push(T typeCube) {
        Cube<T> newCube= new Cube<>(typeCube);
        newCube.setNext(top);
        top = newCube;
        size++;
    }

    @Override
    public T top() throws StackException {
        if(!isEmpty()) {
            return top.getTypeCube();
        } else {
            throw new StackException("Cannot get top from an empty stack");
        }
    }

    @Override
    public T pop() throws StackException {
        if(!isEmpty()) {
            Cube<T> toRemove = top;
            top = toRemove.getNext();
            return toRemove.getTypeCube();
        } else {
            throw new StackException("Trying to get top from an empty stack");
        }

    }

    public int size() {
        return size;
    }

}