package model;

public class NodeKey<K,V> extends Node<V>{

    private K key;
    private V value;

    public NodeKey(K key, V type){

    }


    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V type) {
        this.value = type;
    }
}
