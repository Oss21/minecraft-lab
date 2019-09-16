package interfaces;

import CustomExceptions.QueueException;

public interface IQueue<T> {

    public void enqueue( T element);
    public T dequeue() throws QueueException;
    public void advanceInQueue() throws QueueException;
    public boolean isEmpty();


}
