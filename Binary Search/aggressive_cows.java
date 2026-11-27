

//https://www.geeksforgeeks.org/problems/aggressive-cows/1

class Solution {
    static boolean iva(int[] arr, int k, int mid){
        int cowCount = 1;
        int lp = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]-arr[lp]>=mid){
                cowCount++;
                lp = i;
                if(cowCount == k){
                    return true;
                }
            }
        }
        return false;
    }
    public int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int s = 0;
        int e = arr[n-1] - arr[0];
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(iva(arr,k,mid)){
                ans = mid;
                 s = mid+1;
            }
            else{
               e = mid-1;
            }
        }
        return ans;
    }
}
