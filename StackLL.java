import java.util.Scanner;
public class StackLL {
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
            System.out.println("stack empty");
            return;
            }
        System.out.println("removed"+top.data);
        top=top.next;

        
    }
    void traverse(){
        if(top==null){
            System.out.println("stack empty");
        }
        else{System.out.println("----stack----");
        Node temp=top;    
        while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        StackLL st=new StackLL();
        System.out.println("---menu---");
        System.out.println("1. push");
        System.out.println("2. pop");
        System.out.println("3. traverse");
        System.out.println("4. exit");

        while(true){
            
            System.out.println("enter choice: ");
            int choice =sc.nextInt();
            switch(choice){

                case 1:
                    System.out.println("enter element to push");
                    int data1=sc.nextInt();
                    st.push(data1);
                    break;
                
                case 2:
                    st.pop();
                    break;
                
                case 3:
                    st.traverse();
                    break;

                case 4:
                    System.out.println("exiting");
                    sc.close();
                    return;

                default:
                    System.out.print("invalid choice ");
                    
                
            }

        }
    }
}
