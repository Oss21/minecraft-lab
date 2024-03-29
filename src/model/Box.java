package model;

import CustomExceptions.StackEmptyException;
import dataStructure.Stack;

public class Box {
    public static final int CAPACITY = 64;
    public final static String MADERA = "madera";
    public final static String MADERA_KEY = "123456";

    private Stack<Block<String>> blocks;

    public Box() {
        blocks = new Stack<>();
    }

    public void addBlocks(Block block){
        blocks.push(block);
    }

    public void deleteBlocks() throws StackEmptyException {
        blocks.pop();
    }

}
