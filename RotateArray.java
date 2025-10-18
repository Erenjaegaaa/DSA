import java.util.Scanner;

public class RotateArray {
    // Function to reverse a part of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate the array to the right by k steps
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // handle cases where k > n

        // Step 1: reverse the whole array
        reverse(nums, 0, n - 1);

        // Step 2: reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: reverse remaining elements
        reverse(nums, k, n - 1);
    }

    // Main method (VS Code version)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k (rotation steps): ");
        int k = sc.nextInt();

        rotate(nums, k);

        System.out.println("Array after rotation:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
