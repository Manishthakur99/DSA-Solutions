
 // p c     p=prev c = current
//1,2,3,4

static void sort(int arr[]) {
    int n =arr.length;
    for(int i =1; i<n; i++){
        int curr = i, prev = i-1, currval = arr[i];
        while(prev >= 0 && currval<arr[prev]){
            arr[prev+1] = arr[prev];
            prev--;
        }
        arr[prev+1] = currval;
    }
}

void main(String[] args) {
    int arr[] = {1,2,5,6,3};
    sort(arr);
    for(int i: arr){
        System.out.println(i);;
    }
}
