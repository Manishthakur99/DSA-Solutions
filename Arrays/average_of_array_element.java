static int avg(int[] arr){
    int sum =0;
    for(int i: arr){
        sum += i;
    }
    int size = arr.length;
    int avg = sum/size;
    return avg;
}

void main() {
    int arr[] = {2,3,3,4};
    System.out.println(avg(arr));
}
