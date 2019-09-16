package model;

import CustomExceptions.BlankFieldException;
import CustomExceptions.HashTableException;
import CustomExceptions.QueueException;
import dataStructure.HashTable;
import dataStructure.Queue;
import dataStructure.Stack;

public class Game {

    private HashTable<Integer, Box> inventory;
    private Queue<Stack<Block>> quickAccessBarList;

    public Game() {
        inventory = new HashTable<>();
        quickAccessBarList = new Queue<>();
    }

    public void addBlocksToInventory(String type, int amount) throws HashTableException, BlankFieldException {
        if (!type.equals("")) {
            int counter = 0;
            Box box = null;

            while (amount > 0) {
                if (counter == 0) {
                    box = new Box();
                }
                amount--;
            }

        } else {
            throw new BlankFieldException();
        }
    }

    public void advanceInqueue() throws QueueException {
        quickAccessBarList.advanceInQueue();
    }


    public void creatQuickAccessBar( Block typeBlock){

        Stack<Block> toAdd = new Stack<>();

        toAdd.push(typeBlock);


    }


}