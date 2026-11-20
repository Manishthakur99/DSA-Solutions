static List<Integer> univarsal(int[][] arr) {
    List<Integer> ans = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        for(int j=0; j<n; j++){
            int sum = 0;
            for(int i=0; i<m; i++){
                int val = arr[i][j];
                sum +=val;
            }
            ans.add(sum);
        }
        return new ArrayList<>(ans);
}

void main(String[] args) {
    int arr[][] = {{1,1,1,4,},
                   {1,1,1,1}};
    System.out.println(univarsal(arr));
}
