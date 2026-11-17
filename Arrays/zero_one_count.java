static int[] zereosones(int[] arr){
    int zerocount =0;
    int onescount =0;
    for(int i=0; i<arr.length; i++){
        if(arr[i] == 0){
            zerocount++;
        }else {
            onescount++;
        }
    }
    int ans[] = {zerocount,onescount};
    return ans;
}

void main(String[] args) {
    int arr[] = {0,0,0,0,1,1,1};
    int ans[] = zereosones(arr);
    System.out.println(ans[0]);
    System.out.println(ans[1]);
}
