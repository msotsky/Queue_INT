import java.util.*;
public class IntegerQueue {

    private Node front;
    private Node tail;
    private int size;

    public IntegerQueue(){
        tail = null;
        front = null;
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(int add){
        Node addNode = new Node(add);
        
        if(isEmpty()){
            front = addNode;
            tail = addNode;
        }
        else{
            tail.next = addNode;
            tail = addNode;
        }
        size++;
    }

    public int dequeue() throws NoSuchElementException{
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int removed = front.data;
        front = front.next;
        size--;
        return removed;
    }

    public String toString(){
        String result = "";
        Node temp = front;
        while(temp != null){
            result += temp.data + "\n";
            temp = temp.next;
        }
        return result;
    }
    
    private class Node{
        public int data;
        public Node next;

        public Node(int dataIn){
            data = dataIn;
            next = null;
        }
    }

}
