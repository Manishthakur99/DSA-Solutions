//https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1

class Solution {
    
     static int lb(int[] arr, int target) {
        
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = n; // out of array that's why length using
        
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]>= target){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
     }
        
        static int ub(int[] arr, int target) {
        
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = n;
        
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]<= target){
                s = mid+1;
            }
            else{
                ans = mid;
                e = mid-1;
            }
        }
        return ans;
        }
        
    int countFreq(int[] arr, int target) {
                
                int lbi = lb(arr,target);
                int ubi = ub(arr,target);
                int ans = ubi-lbi;
                return ans;
        
    }
}
