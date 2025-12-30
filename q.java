public class q{
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
    public static void main(String[]args){
        q q=new q();
        q.enq(10);
        q.enq(20);
        q.enq(30);
        q.traverse();
        
        q.deq();
        System.out.println();
        
        q.traverse();
        q.deq();
        System.out.println();
        q.traverse();
        q.deq();
        System.out.println();
        q.traverse();
    }
}
