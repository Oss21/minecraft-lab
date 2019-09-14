package model;

public class Node<T> {

    protected T type;


    public Node(T type) {
        this.type = type;
    }


    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
}
