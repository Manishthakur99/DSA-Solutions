// same as book allocation problem

//https://www.geeksforgeeks.org/problems/the-painters-partition-problem1535/1


class Solution {
    static boolean iva( int arr[], int k, int mid){
            int sc =1;
            int pages  = 0;
            for(int i=0; i<arr.length; i++){
                if(pages+arr[i]<=mid){
                    pages = pages+arr[i];
                }
                else{
                    sc++;
                    if(sc > k || arr[i] > mid){
                        return false;
                    }
                    else{
                        pages = 0;
                        pages = pages + arr[i];
                    }
                }
            }
            return true;
        }
        
    public int minTime(int[] arr, int k) {
        if(arr.length < k){
                    return -1;
                }
                int n = arr.length;
                int s = 1;
                int  sum = 0;
                for(int i=0; i<n; i++){
                    sum += arr[i];
                }

                int e = sum;
                int ans = -1;
                while(s<=e){
                     int mid = s+(e-s)/2;
                     if(iva(arr,k,mid)){
                         ans = mid;
                         e = mid-1; 
                     }
                     else{
                         s = mid+1;
                     }
                }
                return ans;
    }
}
