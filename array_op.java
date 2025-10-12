import java.util.Scanner;

public class array_op {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.print("enter the no of elements:  ");
        int num = sc.nextInt();

        if (num > 100 || num < 0) {
            System.out.print("invalid");
            return;
        }

        System.out.print("enter the elements: ");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("array before insertion: ");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nenter index where to insert (0-based): ");
        int pos = sc.nextInt();

        if (pos > num || pos < 0) {   // ✅ fixed bounds for 0-based index
            System.out.print("invalid");
            return;
        }

        System.out.print("enter element: ");
        int elem = sc.nextInt();

        // ✅ shift elements right starting from that index
        for (int i = num - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }

        arr[pos] = elem;   // ✅ insert at that index
        num++;

        System.out.print("array after insertion: ");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
