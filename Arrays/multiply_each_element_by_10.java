static int[] multiplyby10(int[] arr){
    int n = arr.length;
    int ans[] = new int[n];
    for(int i=0; i<n; i++){
        int e = arr[i];
        int newe  = e*10;
        ans[i] = newe;
    }
    return ans;
}
void main(String[] args) {
    int arr[] = {2,3,3,4};
    int ans[] = multiplyby10(arr);
    for(int i : ans){
        System.out.println(i);
    }
}

//new method by myself
static int[] multiplyby10(int[] arr){
    int n = arr.length;
    int brr[] = new int[n];
    for(int i=0; i<n; i++){
        brr[i] = arr[i]*10;
    }
    return brr;
}
