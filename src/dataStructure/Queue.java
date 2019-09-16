package dataStructure;

import CustomExceptions.QueueException;
import interfaces.IQueue;

public class Queue<T> implements IQueue<T> {

    private int size;
    private Node<T> first;
    private Node<T> last;

    public Queue(){
        size = 0;
    }

    @Override
    public void enqueue(T element) {
        Node<T> current = last;
        last = new Node<>(element);
        if (size++ == 0)
            first = last;
        else current.setNext(last);
    }

    @Override
    public T dequeue() throws QueueException {
        if (size == 0)
            throw new QueueException("The Queue is empty.");
        T ele = first.getValue();
        first = first.getNext();
        if (--size == 0) last = null;
        return ele;
    }

    @Override
    public void advanceInQueue() throws QueueException {
        enqueue(dequeue());
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }
}
