import java.util.Scanner;

public class queueL {
    
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
        Node front,rear=null;
        void enq(int data){
            Node newnode=new Node(data);
            if(rear==null){
                front=rear=newnode;
                return;
            }
            rear.next=newnode;
            rear=newnode;

        }
        void deq(){
            if(front==null){
                System.out.println("empty");
                return;
            }
            System.out.println("removed"+" "+front.data);
            front=front.next;

        }
        void traverse(){
            if(front==null){
                System.out.println("empty");
                return;
            }
            Node temp=front;
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queueL q = new queueL();

        while (true) {
            System.out.println("\n1.Enqueue 2.Dequeue 3.Traverse 4.Exit");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int data=sc.nextInt();
                    q.enq(data);
                    break;
                case 2:
                    q.deq();
                    break;
                case 3:
                    q.traverse();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
