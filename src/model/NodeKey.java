package model;

public class NodeKey<K,T> {

    private K key;
    private T type;

    public NodeKey(K key, T type){}


    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
}
