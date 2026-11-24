// peak element wo element hota h jiska left side me sab ascending me chalega or right me descending me

// https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/2202538398/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = n;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]<arr[mid+1]){
                s = mid+1;
            }
            else{
                ans = mid;
                e = mid-1;
            }
        }
        return ans;
    }
}
