package model;

public class CubeKey<K,T> extends Cube<T> {

    private K key;

    public CubeKey(K key, T typeCube) {
        super(typeCube);
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }


    @Override
    public boolean equals(Object o) {
        CubeKey<K, T> cube = (CubeKey<K, T>) o;
        return this.key.equals(cube.key);
    }
}
