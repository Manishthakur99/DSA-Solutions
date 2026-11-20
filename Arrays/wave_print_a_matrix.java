static List<Integer> univarsal(int[][] arr,int m, int n) {
    List<Integer> ans = new ArrayList<>();

        for(int col=0; col<n; col++){
            if((col & 1)== 1){
                for(int row=m-1; row>=0; row--){
                    ans.add(arr[row][col]);
                }
            }
            else{
                for(int row=0; row<n; row++){
                    ans.add(arr[row][col]);
                }
            }
        }
        return ans;
}

void main(String[] args) {
    int arr[][] = {{1,2,3},
                   {4,5,6},
                   {7,8,9}};
    int m = 3;
    int n = 3;
    System.out.println(univarsal(arr,m,n));

}
