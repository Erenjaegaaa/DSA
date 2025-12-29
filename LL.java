public class LL {
    
        class  Node{
            int data;
            Node next;

            Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    Node head=null;

    void insertBeg(int data){
        Node newnode= new Node(data);
        newnode.next=head;
        head=newnode;
    }
    void insertEnd(int data){
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
    void insertPos(int data,int position){
        Node newnode=new Node(data);
        if(position==1){
            newnode.next=head;
            head=newnode;
            return;
        }
        Node temp=head;
        for(int i=1;i<position;i++){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;



    }
    void deleteBeg(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        head=head.next;
    }
    void deleteEnd(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;   // if u put temp=null method then only reference variable temp would be null the link wont get broken
    }
        void deleteByVal(int val){
        if(head == null){
            System.out.println("empty list");
            return;
        }

        // If value is at head
        if(head.data == val){
            head = head.next;
            return;
        }

        Node temp = head;

        // Traverse till previous node of value
        while(temp.next != null && temp.next.data != val){
            temp = temp.next;
        }

        // Value not found
        if(temp.next == null){
            System.out.println("value not found");
            return;
        }

        // Delete node
        temp.next = temp.next.next;
    }
        void delByPos(int pos){
        if(head == null){
            System.out.println("empty list");
            return;
        }

        if(pos <= 0){
            System.out.println("invalid position");
            return;
        }

        // Delete first node
        if(pos == 1){
            head = head.next;
            return;
        }

        Node temp = head;

        // Move to (pos-1)th node safely
        for(int i = 1; i < pos - 1 && temp.next != null; i++){
            temp = temp.next;
        }

        // Position out of range
        if(temp.next == null){
            System.out.println("position out of range");
            return;
        }

        temp.next = temp.next.next;
    }
        void traverse(){
        if(head == null){
            System.out.println("empty list");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    void sort(){
        Node i=null;
        Node j=null;

        for(i=head;i.next!=null;i=i.next){
            for(j=i.next;j!=null;j=j.next){
                if(i.data>j.data){
                    int temp=i.data;
                    i.data=j.data;
                    j.data=temp;
                    
                }

            }
        }


        
    }
        static Node merge(Node n1,Node n2){
            if(n1==null){
                return n2;
            }
            if(n2==null){
                return n1;
            }
            Node mergedNode;
            if(n1.data <= n2.data){
        mergedNode = n1;
        mergedNode.next = merge(n1.next, n2);
    } else {
        mergedNode = n2;
        mergedNode.next = merge(n1, n2.next);
    }
    return mergedNode;
    
    }
    void reverse(){
        
    }


   public static void main(String[] args) {

        LL list1 = new LL();
        LL list2=new LL();

        list1.insertEnd(30);
        list1.insertEnd(20);
        list1.insertEnd(10);
        list1.traverse();
        list2.insertEnd(35);
        list2.insertEnd(25);
        list2.insertEnd(15);
        list2.traverse();
        list1.sort();
        list1.traverse();
        list2.sort();
        list2.traverse();
        LL listmerge=new LL();
        listmerge.head=merge(list1.head,list2.head);
        listmerge.traverse();
    }

}
 
