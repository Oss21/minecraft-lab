package model;

import exceptions.HashTableException;

import java.util.ArrayList;

public class HashTable<K,V> implements IHashMap<K,V>{

    public final static int HASH_TABLE_SIZE = 27;

    private ArrayList<CubeKey<K,V>> table;
    private CubeKey<K,V> deleted;
    private int primeNumber;

    public HashTable(){
        table = new ArrayList<>(HASH_TABLE_SIZE);
        deleted = new CubeKey<>(null, null);

        for (int i = 0; i < HASH_TABLE_SIZE; i++) {
            table.add(null);
        }
        primeNumber = findPrime();
    }

    @Override
    public void insert(K key, V value) throws HashTableException {
        boolean stop = false;

        for (int i = 0; i < HASH_TABLE_SIZE && !stop; i++) {
            int j = hash(key, i);
            if (table.get(j) == null || table.get(j) == deleted){
                table.set(j, new CubeKey<K,V>(key, value));
                stop = true;
            }
        }
        if (!stop){
            throw new HashTableException();
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
                value = table.get(j).getTypeCube();
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
        return Math.abs(key.hashCode()) % table.size();
    }

    private int hash2(K key){
        return 1+(key.hashCode() % primeNumber);
    }

    private int findPrime() {
        int prime = 1;
        boolean found = false;
        for (int i = table.size() - 1; i > 2 && !found; i--) {
            found = isPrime(i);
            if (found)
                prime = i;
        }
        return prime;
    }

    private boolean isPrime(int numb) {
        boolean isPrime = true;
        if (numb < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= numb && isPrime; i++) {
                if (numb % i == 0) {
                    isPrime = false;
                }
            }
        }
        return isPrime;
    }
}
