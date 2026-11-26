// min max pucha ho max min pucha ho to ye lagega concept -> pehle divide karlo array ka sum karke for mid se compare karao
// and binary search lagao

//https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1


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
    public int findPages(int[] arr, int k) {
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
