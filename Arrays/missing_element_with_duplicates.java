
// indexing approach index = index-1, element = index+1

static List<Integer> univarsal(int[] arr) {
    List<Integer> ans = new ArrayList<>();
    int n =  arr.length;
    for(int index=0; index<n; index++){
        int val = Math.abs(arr[index]);
        int pos = val - 1;
        if(arr[pos]>0){
            arr[pos] = -arr[pos];
        }
    }
    for(int i=0; i<n; i++){
        if(arr[i] > 0){
            ans.add(i+1);
        }
    }
    return ans;
}

void main(String[] args) {
    int arr[] = {1,3,3,4,4,5,6,7};
    System.out.println(univarsal(arr));
}
