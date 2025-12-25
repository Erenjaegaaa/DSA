import java.util.Scanner;
public class Dupli {
    
    class Node{
        Node next;
        int data;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    void in(int data){

        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;

    }
    void sort(){
        Node current,index;
        for(current=head;current!=null&&current.next!=null;current=current.next){
            for(index=current.next;index!=null;index=index.next){
                if(current.data>index.data){
                    int temp=current.data;
                    current.data=index.data;
                    index.data=temp;
                }
            }
        }
    }
    void delete(){
    Node current = head;

    while (current != null && current.next != null) {
    if (current.data == current.next.data) {
        current.next = current.next.next;
    } else {
        current = current.next;
    }
    }    
   
}

    
    void traverse(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+"-->");
            temp=temp.next;
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Dupli d=new Dupli();
        d.in(10);
        d.in(5);
        d.in(10);
        d.in(10);
        d.in(5);
        System.out.println("initial linked list");
        d.traverse();
        d.sort();
        System.out.println("sorted linked list");
        d.traverse();
        System.out.println("duplicate removed linked list");
        d.delete();
        d.traverse();

        
        

    }
}
