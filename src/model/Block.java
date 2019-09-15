package model;

public class Block<T> {

    private T typeBlock;

    public Block(T typeBlock){
        this.typeBlock = typeBlock;
    }

    public T getType() {
        return typeBlock;
    }

    public void setType(T typeBlcok) {
        this.typeBlock = typeBlcok;
    }

}
