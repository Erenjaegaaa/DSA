import java.util.Scanner;
public class ArrayOp {
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array: ");
        int size=sc.nextInt();
        int[]arr=new int[size+1];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        while(true){
            System.out.println();
            System.out.println("1. in ");
            System.out.println("2. del ");
            System.out.println("3. trav ");
            System.out.println("4. ex ");
            System.out.println("5. delete specific element: ");
            System.out.println("enter choice:  ");
            int choice=sc.nextInt();

            switch(choice){

                case 1:
                System.out.println("enter pos you want to insert: ");
                int pos=sc.nextInt();
                System.out.println("enter elem you want to insert: ");
                int elem=sc.nextInt();
                for(int i=size;i>=pos;i--){
                    arr[i]=arr[i-1];
                }
                size++;
                arr[pos-1]=elem;

                break;

                case 2:
                System.out.println("enter pos you want to del: ");
                int pos2=sc.nextInt();
                for(int i=pos2-1;i<size-1;i++){
                    arr[i]=arr[i+1];
                }
                size--;
                break;

                case 3:
                for(int i=0;i<size;i++){
                    System.out.print(arr[i]+" ");
                }
                break;

                case 4:
                System.out.print("exiting");
                return;

                case 5:
                System.out.println("enter element you want to delete: ");
                int key=sc.nextInt();
                int pos3=-1;
                for(int i=0;i<size;i++){
                    if(arr[i]==key){
                        pos3=i;
                        break;
                    }
                }
                if(pos3==-1){
                    System.out.print("not exists");

                }
                else{
                    for(int j=pos3;j<size-1;j++){
                        arr[j]=arr[j+1];
                    }
                    size--;
                }
                break;
                   
                default:
                System.out.println("wrong choice");
                break;
            }
        }

    }
}
