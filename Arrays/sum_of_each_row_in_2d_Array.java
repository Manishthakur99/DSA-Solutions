

//isme agar row and col same hai to int m = arr.length ke baad int n = arr[0].length se 
// ans nikal aayega but agar row and col length diff hai to ye logic lagega jo likha hai


static List<Integer> univarsal(int[][] arr) {
    List<Integer> ans = new ArrayList<>();
        int m = arr.length;

        for(int i=0; i<m; i++){
            int sum = 0;
            for(int j=0; j<arr[i].length; j++){
                int val = arr[i][j];
                sum +=val;
            }
            ans.add(sum);
        }
        return new ArrayList<>(ans);
}

void main(String[] args) {
    int arr[][] = {{1,1,1,4,1},
                   {1,1,1,1}};
    System.out.println(univarsal(arr));
}
