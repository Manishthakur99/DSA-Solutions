class Solution {
    public int findTarget(int arr[], int target) {
        // int n = arr.length;
        // for(int i=0; i<n; i++){
        //     if(arr[i] == target){
        //         return i;
        //     }
        // }
        // return -1;
        int n = arr.length;
        int s = 0;
        int e = n-1;
        
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid-1>=0 && arr[mid-1] == target){
                return mid-1;
            }
            if(arr[mid] == target){
                return mid;
            }
            if(mid+1<n&&arr[mid+1] == target){
                return mid+1;
            }
            if(target>arr[mid]){
                s = mid+1; //optimization mid+2 bhi kar sakte h
            }
            else{
                e = mid-1;//optimization mid-2 bhi kar sakte h
            }
        }
        return -1;
    }
}
