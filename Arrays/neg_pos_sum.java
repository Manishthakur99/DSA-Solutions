static int[] sumofposneg(int arr[]){
    int posum = 0;
    int negsum = 0;
    for(int i=0 ; i<arr.length; i++){

        if(arr[i] >= 0) {
            posum += arr[i];
        }
        if(arr[i] <= 0){
            negsum += arr[i];
        }
    }
    int ans[] = {posum,negsum};
    return ans;
}

void main(String[] args) {
    int arr[] = {-2,3,4};
    int ans[] = sumofposneg(arr);
    System.out.println(ans[0]);
    System.out.println(ans[1]);
}
