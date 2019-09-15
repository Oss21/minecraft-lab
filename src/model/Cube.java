package model;

public class Cube<T> {

    private T typeCube;
    private Cube<T> next;

    public Cube(T typeCube) {
        this.typeCube = typeCube;
        next = null;
    }

    public T getTypeCube() {
        return typeCube;
    }

    public void setValue(T typeCube) {
        this.typeCube = typeCube;
    }


    public Cube<T> getNext() {
        return next;
    }

    public void setNext(Cube<T> next) {
        this.next = next;
    }

    public void insert(Cube<T> cube) {
        if(next == null) {
            next = cube;
        }else{
            next.insert(cube);
        }
    }
}

