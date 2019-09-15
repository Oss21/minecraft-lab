package model;

public class Stack<V> implements IStack<V>{

    private int size;
    public Node<V> nodeTop;

    public Stack(){
        nodeTop = null;
        size = 0;
    }


    @Override
    public boolean isEmpty() {
        boolean isEmpty = true;

        if (nodeTop != null){
            isEmpty = false;
        }

        return isEmpty;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void push(Node<V> node) {

    }

    @Override
    public Node<V> peek() {
        return null;
    }

    @Override
    public Node<V> pop() {
        return null;
    }
}
