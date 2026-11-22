// conditions -> 1. entire increasing or decreasing ( sorted ) 
//            -> 2. random acess possible ( for ex: no need to travel whole array to find element. directly go )
//            -> 3. dividing for array in left or right should be possible

// int mid = s+(e-s)/2; --> optimization if mid value is bigger or integer overflow condition

static int sort(int[] arr, int target) {
    int n =arr.length;
    int s = 0;
    int e = n-1;

    while(s<=e){
        int mid = s+(e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(target > arr[mid]){
            s = mid+1;
        }
        else{
            e = mid-1;
        }
      // ye bhul jaate h log yaad rakhna
       mid = s+(e-s)/2;
    }
    return -1;
}

void main(String[] args) {
    int arr[] = {1,2,5,6,3};
    int target = 1;
    System.out.println(sort(arr,target));
}
