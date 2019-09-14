package model;

import exceptions.HashTableException;

public interface IHashMap<K,T> {

    public void insert(K key, T value) throws HashTableException;
    public T search(K key) throws HashTableException;
    public void delete(K key);

}
