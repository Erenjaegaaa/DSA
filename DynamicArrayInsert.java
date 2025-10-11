import java.util.Scanner;

public class DynamicArrayInsert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MAX_CAPACITY = 10;
        int[] arr = new int[MAX_CAPACITY];
        int currentSize = 0;

        // --- 1. Get Initial Array Elements from User ---
        System.out.print("Enter the initial number of elements (max " + MAX_CAPACITY + "): ");
        currentSize = scanner.nextInt();

        if (currentSize > MAX_CAPACITY || currentSize < 0) {
            System.out.println("Invalid size. Exiting.");
            scanner.close();
            return;
        }

        System.out.println("Enter the " + currentSize + " initial elements one by one:");
        for (int i = 0; i < currentSize; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("\nCurrent Array: [");
        printArray(arr, currentSize);

        // --- 2. Get Element and Position for Insertion ---
        if (currentSize >= arr.length) {
            System.out.println("\nArray is full! Cannot insert more elements.");
            scanner.close();
            return;
        }

        System.out.print("Enter element to insert: ");
        int newElement = scanner.nextInt();

        System.out.print("Enter position (1 to " + (currentSize + 1) + "): ");
        int userPos = scanner.nextInt();
        int pos = userPos - 1; // Convert 1-based position to 0-based index

        if (pos < 0 || pos > currentSize) {
            System.out.println("Invalid position! Insertion failed.");
            scanner.close();
            return;
        }

        // --- 3. Insertion Logic (Shifting) ---
        // Shift elements to the right to make space
        for (int i = currentSize - 1; i >= pos; i--) {
            arr[i + 1] = arr[i]; 
        }

        // --- 4. Insert Element and Update Size ---
        arr[pos] = newElement;
        currentSize++;

        // --- 5. Display Result ---
        System.out.print("\nArray After Insertion: [");
        printArray(arr, currentSize);
        System.out.println("\nNew Size: " + currentSize);

        scanner.close();
    }

    // Helper method to print array elements
    public static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + (i < size - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}