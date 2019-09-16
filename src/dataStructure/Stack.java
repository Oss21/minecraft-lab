package dataStructure;

import CustomExceptions.StackEmptyException;
import interfaces.IStack;

public class Stack<T> implements IStack<T> {

    private Node<T> top;
    private int size;

    public Stack() {
        top = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty = false;
        if (top == null){
            isEmpty = true;
        }
        return isEmpty;
    }

    @Override
    public void push(T typeBlock) {
        Node<T> toAdd = new Node<>(typeBlock);
        toAdd.setNext(top);
        top = toAdd;
        size++;
    }

    @Override
    public T peek() throws StackEmptyException {
        if (!isEmpty()){
            Node<T> toPeek = top;
            return toPeek.getValue();
        }else {
            throw new StackEmptyException();
        }
    }

    @Override
    public T pop() throws StackEmptyException {
        if (!isEmpty()){
            Node<T> toPop = top;
            top = toPop.getNext();
            size --;
            return toPop.getValue();
        }else {
            throw new StackEmptyException();
        }
    }

    public int size() {
        return size;
    }

}