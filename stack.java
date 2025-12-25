public class stack {
    class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    Node top=null;
    void push(int data){
        Node newnode=new Node(data);
        newnode.next=top;
        top=newnode;
    }
    void pop(){
        if(top==null){
            System.out.print("empty");
            return;
        }
        System.out.print("removed"+top.data);
        top=top.next;

    }
}
