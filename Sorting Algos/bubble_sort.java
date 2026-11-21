// sorting kardega but multiple rounds lega -> size of aaray - 1
// adjacent element -> compare -> swap

static void sort(int arr[]) {
    int n =arr.length;
    for(int i=0; i<n-1; i++){
        for(int j=0; j<n-i-1; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp ;
            }
        }
    }
}

void main(String[] args) {
    int arr[] = {1,2,5,6,3};
    sort(arr);
    for(int i: arr){
        System.out.println(i);;
    }
}
