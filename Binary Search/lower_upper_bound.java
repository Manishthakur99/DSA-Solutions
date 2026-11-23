// lower bound hamesha smallest value dega which is great or equal to the target val.

int countFreq(int[] arr, int target) {
        
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        
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

// upperbound --> target se just badi value

  int countFreq(int[] arr, int target) {
        
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        
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
