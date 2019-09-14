package model;

public class Queue<T> implements IQueue<T> {

    private int size;
    private Stack<T> quickAccessBarPop;

    public Queue(){}


    @Override
    public void add(Stack quickAccessBar) {

    }

    @Override
    public Stack<T> peek() {
        return null;
    }

    @Override
    public Stack<T> poll() {
        return null;
    }

    @Override
    public void remove() {

    }

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
}
