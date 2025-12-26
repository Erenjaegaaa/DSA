public class QueueLarge {
    class Node{
        int data;
        Node next;

        Node(int data){

            this.data=data;
            this.next=null;
        }
    }
    Node front,rear=null;
    Node front2,rear2=null;
    void enq(int data){

        Node newnode=new Node(data);
        if(rear==null){
            front=rear=newnode;
            return;
        }
        rear.next=newnode;
        rear=newnode;

        Node newnode2=new Node(data);
        if(rear2==null||data>front2.data){
            rear2.next=newnode2;
            rear2=newnode;
        }

    }
    void deq(){
        if(front2==null){
            System.out.println("empty");
            return;
        }
        System.out.println("removed"+" "+front.data);
        front=front.next;
        if(front2.data==front.data){
            front2=front2.next;
        }
    }
    int max(){
        if(front2==null){
            System.out.println("empty");
            return -1;
        }
        return front2.data;
    }
    public static void main(String[]args){
        QueueLarge q=new QueueLarge();
        
    }

}
