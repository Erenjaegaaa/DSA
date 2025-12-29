import java.util.Scanner;
public class Stackss {
    
    int size;
    int top;
    int[]stack;
    

    Stackss(int size){

        this.size=size;
        top=-1;
        stack=new int[size];
    }

    void push(int data){
        if(top>=size-1){
            System.out.println("stack overflow");
            return;
        }
        top++;
        stack[top]=data;
    }
    void pop(){

        if(top==-1){
            System.out.println("stack underflow");
            return;
        }
        top--;
    }
    void traverse(){
        if(top==-1){
            System.out.println("stack underflow");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of stack: ");
        int size=sc.nextInt();
        Stackss st=new Stackss(size);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(20);
        st.push(30);
        st.push(30);
        st.traverse();
        st.pop();
        st.traverse();
        st.pop();
        st.traverse();
        st.pop();
        st.traverse();

    }
}
