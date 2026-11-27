//https://www.geeksforgeeks.org/problems/cut-woods/1


class Solution {
    
    static boolean iva(int arr[], int m , int mid){
        long twc = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>mid){
                long ctwc = arr[i]-mid;
                twc += ctwc;
            }
        }
        if(twc >= m){
            return true;
        }
        else{
            return false;
        }
    }
    int maxHeight(int[] arr, int m) {
        // code here
        int n = arr.length;
        int s = 0;
        int max = -1;
        
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int ans = -1;
        int e = max;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(iva(arr,m,mid)){
                ans = mid;
                s = mid +1;
            }
            else{
                 e = mid -1;
            }
        }
        return ans;
    }
}
