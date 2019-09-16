package model;

import CustomExceptions.BlankFieldException;
import CustomExceptions.HashTableException;
import CustomExceptions.QueueException;
import dataStructure.HashTable;
import dataStructure.Queue;
import dataStructure.Stack;

public class Game {

    private HashTable<Long, Box> inventory;
    private Queue<Stack<Block>> quickAccessBarList;

    public Game() {
        inventory = new HashTable<>();
        quickAccessBarList = new Queue<>();
    }

    public void addBlocksToInventory(String type, int amount) throws HashTableException, BlankFieldException {
        if (!type.equals("")) {
            int counter = 0;
            Box box = null;
            long key = calculateKey(type);

            while (amount > 0) {
                if (counter == 0) {
                    box = new Box();
                }
                Block<String> block = new Block<>(type);
                box.addBlocks(block);

                counter ++;
                if (counter > 64){
                    counter = 0;
                    inventory.insert(key, box);
                }
                amount--;
            }
            inventory.insert(key, box);

        } else {
            throw new BlankFieldException();
        }
    }

    public void advanceInQueue() throws QueueException {
        quickAccessBarList.advanceInQueue();
    }


    public void creatQuickAccessBar( Box typeBlock){
        Stack<Box> toAdd = new Stack<>();

        toAdd.push(typeBlock);
    }

    private long calculateKey(String type){
        int base = 26;
        long n = 0;
        long k = 0;
        int[] values = new int[type.length()];

        for (int i = 0; i < type.length(); i++) {
            values[i] = (int) type.charAt(i);
        }

        for (int i = values.length - 1; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                if (n == 0){
                    n = base;

                }else {
                    n = n*base;
                }

            }
            k = k + (values[i]*n);
            n = 0;
        }
        return k;
    }
}