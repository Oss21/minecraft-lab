package model;

import CustomExceptions.BlankFieldException;
import CustomExceptions.HashTableException;
import dataStructure.*;

public class Game {
    private HashTable<String, Stack> inventory;
    private Queue<Stack<Block>> quickAccessBarList;

    public Game() {
        inventory = new HashTable<>();
        quickAccessBarList = new Queue<>();
    }

    public void addBlocksToInventory(String type, int amount) throws HashTableException, BlankFieldException {
        if (!type.equals("")){
            int counter = 0;
            Box box = null;

            Stack<Node> stack = null;
            while(amount > 0){
                if (counter == 0){
                    if (type.equals(Box.MADERA)){
                        box = new Box();
                        stack = new Stack<>();
                        NodeKey<String,String> addHash = new NodeKey(Box.MADERA_KEY,Box.MADERA);
                        Node<String> add = new Node(Box.MADERA);
                        stack.push(add);
                        inventory.insert(Box.MADERA_KEY,stack);
                    }


                }
                

                amount --;
            }
            System.out.println(stack.size());
        }else {
            throw new BlankFieldException();
        }
    }


}
