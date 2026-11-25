// https://leetcode.com/problems/search-in-rotated-sorted-array/

class Solution {
    static int pi(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        int ans = n;

        if (nums[s] <= nums[e]) {
            return -1;
        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] <= nums[n - 1]) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }

    static int bs(int[] nums, int s, int e, int target) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int p = pi(nums);
        int n = nums.length;

        if (p == -1) {
            int ans = bs(nums, 0, n - 1, target);
            return ans;
        } else {
            int sa1 = 0;
            int ea1 = p;
            if (target >= nums[sa1] && target <= nums[ea1]) {
                int ans = bs(nums, sa1, ea1, target);
                return ans;
            }
            int sa2 = p + 1;
            int ea2 = n - 1;
            if (target >= nums[sa2] && target <= nums[ea2]) {
                int ans = bs(nums, sa2, ea2, target);
                return ans;
            }
        }
        return -1;
    }
}
