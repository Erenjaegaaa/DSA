import java.util.Scanner;
public class Linked {
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.next=null;
            this.data=data;
        }

    }
     Node head=null;
    void beg(int data){

        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;

    }
    void end(int data){
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
    void pos(int data,int position){
        if(position==1){
            beg(data);
            return;
        }
        Node temp=head;
        Node newnode=new Node(data);
        for(int i=1;i<position-1;i++){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        

    }
    void traverse() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Linked list=new Linked();
        while (true){
            System.out.println("\n--- MENU ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. traverse");
            System.out.println("5. exit");
            System.out.println("enter choice: ");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                System.out.println("enter data beg");
                int data1=sc.nextInt();
                list.beg(data1);
                break;

                case 2:
                System.out.println("enter data end");
                int data2=sc.nextInt();
                list.end(data2);
                break;

                case 3:
                System.out.println("enter pos");
                int position=sc.nextInt();
                System.out.println("enter data at pos");
                int data3=sc.nextInt();
                list.pos(data3,position);
                break;

                case 4: 
                System.out.println(". list");
                list.traverse();
                break;
                
                case 5:
                System.out.println("exiting");
                sc.close();
                return;

                default:
                System.out.println("inavlid choice");
                

            }
        }

    }
}
