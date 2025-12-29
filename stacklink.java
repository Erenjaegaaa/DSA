public class stacklink {
    
        class Node{
            Node next;
            int data;
        
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
        top=top.next;

    }
    void traverse(){
        if(top==null){
            System.out.print("empty");
            return;
        }
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[]args){
        stacklink st=new stacklink();
        st.push(10);
        st.push(20);
        st.push(30);
        st.traverse();
        st.pop();
        st.traverse();
        st.pop();
        st.push(30);
        st.traverse();
        st.pop();
        st.traverse();
    }

}
