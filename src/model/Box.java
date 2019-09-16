package model;

import dataStructure.Stack;

public class Box {

    public static final int CAPACITY = 64;

    private Stack<Block<String>> blocks;

    public Box() {
        blocks = new Stack<>();
    }

    public void addBlocks(Block block){
        blocks.push(block);
    }

}
