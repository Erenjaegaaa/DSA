import java.util.Scanner;
public class minStack 
{
    class Node{
        Node next;
        int data;

        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    Node top=null; 
    Node mintop=null;
        void push(int data){

            Node newnode=new Node(data);
            newnode.next=top;
            top=newnode;

            if(mintop==null||data<=mintop.data){
                Node minNode=new Node(data);
                minNode.next=mintop;
                mintop=minNode;
                
            }

        }
        void pop(){
            if(top==null){
                System.out.print("empty stack");
                return;
            }
            int removed=top.data;
            top=top.next;
            
            if(removed==mintop.data){
                mintop=mintop.next;
            }

        }
        
    void traverse(){
         if(top==null){
            System.out.println("empty");
                return;
            }
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }

    int Stackmin(){

        if(mintop==null){
            System.out.println("no more min elements");
            return -1;
        }
        return mintop.data;
        
    }
    
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    minStack st=new minStack();
    st.push(10);
    st.push(20);
    st.push(15);
    st.push(5);
    System.out.println("stack initially :");
    st.traverse();
    System.out.println("current min:"+st.Stackmin());
    st.pop();
    st.traverse();
    System.out.println("current min:"+st.Stackmin());
    st.pop();
    st.traverse();
    System.out.println("current min:"+st.Stackmin());
    st.pop();
    st.traverse();
    System.out.println("current min:"+st.Stackmin());
    st.pop();
    st.traverse();
    System.out.println("current min:"+st.Stackmin());



    }
}

