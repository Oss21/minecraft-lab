package model;

public interface IStack<T> {

    public boolean isEmpty();
    public int getSize();
    public void setSize(int size);
    public void push(Node<T> node);
    public Node<T> peek();
    public Node<T> pop();

}
