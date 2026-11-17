static boolean search(int arr[], int target){
    for(int i=0; i<arr.length; i++){
        if(arr[i] == target){
            return true;
        }
    }
    return false;
}
void main(String[] args) {
    int arr[] = {2,3,3,4};
    int target = 1;
    System.out.println(search(arr,target));
}
