package interfaces;

import dataStructure.Stack;

public interface IQueue<T> {

    public void add(Stack<T> quickAccessBar );
    public Stack<T> peek();
    public Stack<T> poll();
    public void remove();
    public boolean isEmpty();
    public int getSize();
    public void setSize(int size);


}
