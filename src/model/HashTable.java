package model;

import exceptions.HashTableException;

import java.util.ArrayList;

public class HashTable<K,T> implements IHashMap<K,T>{

    public final static int HASH_TABLE_SIZE = 27;

    private ArrayList<NodeKey<K,T>> table;
    private NodeKey<K,T> deleted;

    public HashTable(){}


    @Override
    public void insert(K key, T value) throws HashTableException {

    }

    @Override
    public T search(K key) throws HashTableException {
        return null;
    }

    @Override
    public void delete(K key) {

    }



}
