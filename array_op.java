
import java.util.Scanner;
public class array_op {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int [] arr=new int[100];
        System.out.print("enter the no of elements:  ");
        int num=sc.nextInt();

        if(num>100||num<0){
            System.out.print("invalid");
            return;
        }
        System.out.print("enter the elem:");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
           
        }
        for(int i=0;i<num;i++){
            System.out.print(arr[i]);

        }
        System.out.print("enter pos: ");
        int pos=sc.nextInt();
        if(pos>num||pos<0){
            System.out.print("invalid");
            return;
        }
        System.out.print("enter element: ");
        int elem=sc.nextInt();
        for(int i=num-1;i>=pos-1;i--){
            
            arr[i+1]=arr[i];

        }
        arr[pos-1]=elem;
        num++;
        for(int i=0;i<num;i++){
            System.out.print("new array"+arr[i]);

        }
        



    }
}
