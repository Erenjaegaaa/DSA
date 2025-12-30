import java.util.Scanner;
public class arr {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter size of array");
        int size=sc.nextInt();
        int[]arr=new int[size+1];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        while(true){
            System.out.println();
            System.out.println("1: insert at pos");
            System.out.println("2: delete at pos");
            System.out.println("3: delete a val");
            System.out.println("4: exit");
            System.out.println("5: traversl");
            System.out.println("enter choice: ");
            int choice=sc.nextInt();

            switch(choice){

                case 1:
                System.out.print("enter element to insert: ");
                int element=sc.nextInt();
                System.out.println("enter pos to insert: ");
                int pos1=sc.nextInt();

                for(int i=size;i>=pos1;i--){
                    arr[i]=arr[i-1];


                }
                size++;
                arr[pos1-1]=element;

                break;

                case 2:
                System.out.println("enter pos to delete: ");
                int pos2=sc.nextInt();
                for(int i=pos2-1;i<size-1;i++){
                    arr[i]=arr[i+1];
                }
                size--;
                break;

                case 3:
                System.out.println("enter element you want to delete: ");
                int elem=sc.nextInt();
                int pos3=-1;
                for(int i=0;i<size;i++){
                    if(arr[i]==elem){
                        pos3=i;
                        break;
                    }
                    
                }
                if(pos3==-1){
                    System.out.println("not exists");
                    
                }else{for(int i=pos3;i<size-1;i++){
                    arr[i]=arr[i+1];
                }
            }
                size--;
                
                break;

                case 4:
                System.out.println("exiting..");
                return;

                case 5:
                System.out.println("array: ");
                for(int i=0;i<size;i++){
                    System.out.print(arr[i]+" ");
                }
                break;

                default:
                System.out.println("wrong choice ");
                break;

            }



        }

    }
}
