import java.util.Scanner;
public class array {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] arr= new int[100];
        System.out.print("enter number of elements: ");
        int num= sc.nextInt();

        if(num>100||num<0){
            System.out.print("invalid");
            return;
        }
        System.out.print("enter elements: ");
        for(int i=0;i<num;i++){

            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){

            System.out.println(arr[i]);
        }
        System.out.print("enter pos you want to insert: ");
        int pos=sc.nextInt();
        
        if(pos>num||pos<0){
            System.out.println("invalid");
            return;
        }
        System.out.print("enter elem you want to insert: ");
        int elem=sc.nextInt();
        for(int i=num-1;i>=pos;i--){
            arr[i+1]=arr[i];
            
        }
        arr[pos]=elem;
        num++;
        System.out.println("array after insertion: ");
        for(int i=0;i<num;i++){
            System.out.println(arr[i]);
        }

    }
}
