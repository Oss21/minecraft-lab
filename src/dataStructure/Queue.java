package dataStructure;

import CustomExceptions.QueueException;
import interfaces.IQueue;

public class Queue<T> implements IQueue<T> {


   // private int first;
   // private int next;
   // private T[] list;

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


    /**

    public Queue(){
        size = 0;
        list = (T[]) new Object[2];
    }



    private void resize(int capacity)
    {
        T[] tmp = (T[]) new Object[capacity];

        for (int i = 0; i < size; i++)
            tmp[i] = list[(first + i) % list.length];

        list = tmp;
        first = 0;
        next = size;
    }

    @Override
    public void enqueue(T quickAccessBar) {

        if (list.length == size)
            resize(list.length * 2);
        list[next++] = quickAccessBar;
        if (next == list.length)
            next = 0;
        size++;

        //return (T) this;
    }

    @Override
    public T dequeue() throws QueueException {

        if (isEmpty())
            throw new QueueException("The Queue is empty.");
        T ele = list[first];
        list[first] = null;
        if (++first == list.length)
            first = 0;
        if (--size > 0 && size == list.length / 4)
            resize(list.length / 2);

        return ele;
    }

    @Override
    public boolean isEmpty() {
     return size == 0;

    }

    **/


}
