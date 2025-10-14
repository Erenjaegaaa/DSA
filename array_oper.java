import java.util.Scanner;
public class array_oper{

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];
        System.out.print("enter total size of arr: ");
        int num=sc.nextInt();
        if(num>100||num<0){
            System.out.print("invalid ");
            return;

        }for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int choice=0;
        while(choice<4){
            System.out.println("\n=== MENU ===");
            System.out.println("1. Insert element");
            System.out.println("2. Delete element");
            System.out.println("3. Display array");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
            case 1:
            System.out.print("enter pos you want to enter: ");
            int pos=sc.nextInt();
            if(pos>num||pos<0){
                System.out.print("invalid ");
                break;
            }
            System.out.print("enter element you want to enter: ");
            int elem=sc.nextInt();
            for(int i=num;i>=pos;i--){
                arr[i+1]=arr[i];
                

            }arr[pos]=elem;
            num++;
            break;

            default:
            System.out.print("invalid choice");
            case 3:
            for(int i=0;i<num;i++){
                System.out.print(arr[i]);
            }
        }
        
    }
}

}