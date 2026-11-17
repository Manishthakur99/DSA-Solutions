static int maxele(int arr[]){
    int max = arr[0];
    for(int i=0; i<arr.length; i++){
        if(arr[i] >= max){
            max=arr[i];
        }
    }
    return max;
}

void main(String[] args) {
    int arr[] = {2,9,3,3,4};
    System.out.println(maxele(arr));
}
