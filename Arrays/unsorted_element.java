static int unsortedele(int arr[]){
    for(int i=0; i<arr.length; i++){
        if(arr[i+1] <= arr[i]){
            return arr[i+1];
        }
    }
    return -1;
}

void main(String[] args) {
    int arr[] = {2,3,9,5,3};
    System.out.println(unsortedele(arr));

}
