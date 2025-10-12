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
        System.out.println("pos you want to delete: ");
        int pos=sc.nextInt();
        for(int i=pos;i<num-1;i++){
            arr[i]=arr[i+1];
            
        }num--;
        System.out.print("new set:");
        for(int i=0;i<num;i++){
            System.out.print(arr[i]);
        }
    }
}
