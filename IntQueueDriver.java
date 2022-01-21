import java.util.NoSuchElementException;

public class IntQueueDriver {
    
    public static void main(String[] args){
        IntegerQueue q = new IntegerQueue();
        
        q.enqueue(0);
        q.enqueue(1);
        q.enqueue(6);
        q.enqueue(3);

        System.out.println(q.toString());

        try{
            while(!q.isEmpty()){
                System.out.println("Removed: " + q.dequeue());
            }
            System.out.println("Queue is empty: " + q);
        }catch(NoSuchElementException e){
            System.out.println("No elements to remove");
        }
        
    }
}
