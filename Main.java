import java.util.Scanner;

class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;  // Not sorted
            }
        }

        return true;  // All pairs were sorted
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        boolean ans = sol.check(nums);

        if (ans) {
            System.out.println("The array is sorted in non-decreasing order.");
        } else {
            System.out.println("The array is NOT sorted.");
        }

        sc.close();
    }
}

