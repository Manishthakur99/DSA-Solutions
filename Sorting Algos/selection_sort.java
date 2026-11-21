// unsorted part -> min value -> correct position


static void sort(int arr[]) {
    int n =arr.length;
    for(int i=0; i<n-1; i++){
        int mi = i;
        for(int j=i+1; j<n; j++){
            if(arr[j]<arr[i]){
                i = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[i];
        arr[i] = temp ;
    }
}

void main(String[] args) {
    int arr[] = {1,2,5,6,3};
    sort(arr);
    for(int i: arr){
        System.out.println(i);;
    }
}
