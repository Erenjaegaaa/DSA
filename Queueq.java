import java.util.Scanner;
public class Queueq {
    
    int capacity;
    
    int[]queue;
    int front;
    int rear;
    Queueq(int capacity){
        this.capacity=capacity;
        front=-1;
        rear=-1;
        queue=new int[capacity];
    }

    void enqueue(int data){
        if(rear>=capacity-1){
            System.out.println("full queue");
            return;
        }

        if(front==-1){
            front=0;
        }
        rear++;
        queue[rear]=data;
    }
 void dequeue() {
    if (front == -1 || front > rear) {
        System.out.println("empty");
        return;
    }

    front++;

    // Reset queue when empty
    if (front > rear) {
        front = rear = -1;
    }
}
    void traverse(){
         if(front==-1||front>rear){
            System.out.println("empty");
            return;
        }
        System.out.println("elements are: ");
        for(int i=front;i<=rear;i++){
            
            System.out.println(queue[i]+" ");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter capacity: ");
        int capacity=sc.nextInt();
        Queueq q=new Queueq(capacity);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.traverse();
        q.dequeue();
        q.traverse();
        q.dequeue();
        q.traverse();
        q.dequeue();
        q.traverse();
        q.dequeue();
        q.traverse();
        q.enqueue(50);
        q.traverse();
        
    }

}
