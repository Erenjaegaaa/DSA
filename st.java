import java.util.Scanner;
public class st {
    int top;
    int size;
    int []stack;
    st(int size){
        this.size=size;
        top=-1;
        stack=new int[size];
    }
    void push(int data){
        if(top>=size-1){
            System.out.println("full");
            return;
        }
        top++;
        stack[top]=data;
    }
    void pop(){
        if(top==-1){
            System.out.println("empty");
            return;
        }
        top--;

    }
    void traverse(){
        if(top==-1){
            System.out.print("empty");
            return;
        }
        for(int i=top;i>=0;i--){
        
            System.out.println(stack[i]);
            
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size: ");
        int size=sc.nextInt();
        st s=new st(size);
        s.push(20);
        s.push(30);
        s.push(40);
        s.traverse();
        s.push(50);
        s.traverse();
        s.pop();
        s.traverse();
        s.pop();
        s.traverse();
        s.pop();
        s.traverse();
    }


}
