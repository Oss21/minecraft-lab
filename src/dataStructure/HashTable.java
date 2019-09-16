package dataStructure;

import CustomExceptions.HashTableException;
import interfaces.IHashMap;

import java.util.ArrayList;

public class HashTable<K,V> implements IHashMap<K,V> {

    public final static int HASH_TABLE_SIZE = 27;

    private ArrayList<NodeKey<K,V>> table;
    private NodeKey<K,V> deleted;

    public HashTable(){
        table = new ArrayList<>(HASH_TABLE_SIZE);
        deleted = new NodeKey<>(null, null);

        for (int i = 0; i < HASH_TABLE_SIZE; i++) {
            table.add(null);
        }
    }

    @Override
    public void insert(K key, V value) throws HashTableException {
        boolean stop = false;

        for (int i = 0; i < HASH_TABLE_SIZE && !stop; i++) {
            int j = hash(key, i);
            if (table.get(j) == null || table.get(j) == deleted){
                table.set(j, new NodeKey<>(key, value));
                stop = true;
            }
        }
        if (!stop){
            throw new HashTableException();
        }

        for (int i = 0; i < table.size(); i++) {
            System.out.println(table.get(i));
        }
    }

    @Override
    public V search(K key) throws HashTableException {
        V value = null;
        boolean stop = false;

        for (int i = 0; i < HASH_TABLE_SIZE && !stop; i++) {
            int j = hash(key, i);
            if (table.get(j) == null){
                stop = true;

            }else if (table.get(j) != null && table.get(j).getKey().equals(key)){
                value = table.get(j).getValue();
                stop = true;
            }
        }
        return value;
    }

    @Override
    public void delete(K key) {
        boolean stop = false;

        for (int i = 0; i < HASH_TABLE_SIZE && !stop; i++) {
            int j = hash(key, i);
            if (table.get(j) == null){
                stop = true;

            }else if (table.get(j) != null && table.get(j).getKey().equals(key)){
                table.set(j, deleted);
                stop = true;
            }
        }
    }

    private int hash (K key, int i){
        return (hash1(key) + i*hash2(key));
    }

    private int hash1(K key){
        int toReturn = 0;
        double n1 = key.hashCode()*0.618;
        double n2 = n1 % 1;

        double n3  = Math.floor(table.size()*n2);
        toReturn = (int) n3;

        return toReturn;
    }

    private int hash2(K key){
        int toReturn = 0;

        toReturn = key.hashCode() % table.size();

        return toReturn;
    }
}
