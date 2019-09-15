package interfaces;

import CustomExceptions.HashTableException;

public interface IHashMap<K,V> {

    public void insert(K key, V value) throws HashTableException;
    public V search(K key) throws HashTableException;
    public void delete(K key);

}
