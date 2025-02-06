package org.example.binarysearch;
import java.util.Arrays;

public class Challenge {

        public static int FirstMissingPositive(int[] nums) {
            int n = nums.length;
            boolean[] visited = new boolean[n + 1];

            for (int num : nums) {
                if (num > 0 && num <= n) {
                    visited[num] = true;
                }
            }

            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    return i;
                }
            }

            return n + 1;
        }

    public static int binarySearch(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
            int[] arr = {3,4,-1,2};
        System.out.println(FirstMissingPositive(arr));
        System.out.println(binarySearch(arr , 1));

    }
}

