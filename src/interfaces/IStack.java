package interfaces;

import CustomExceptions.StackEmptyException;

public interface IStack<T> {

    public boolean isEmpty();

    public void push(T item);

    public T peek() throws StackEmptyException;

    public T pop() throws StackEmptyException;

    public int size();
}

