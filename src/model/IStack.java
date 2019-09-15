package model;

public interface IStack<V> {

    public boolean isEmpty();
    public int getSize();
    public void setSize(int size);
    public void push(Node<V> node);
    public Node<V> peek();
    public Node<V> pop();

}
