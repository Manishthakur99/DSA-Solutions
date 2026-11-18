static int[] univarsal(int[] arr){
    HashMap<Integer, Integer> freq = new HashMap<>();
    for(int num: arr){
        freq.put(num, freq.getOrDefault(num,0)+1);
    }
    int hf = Integer.MIN_VALUE;
    int hn = -1;
    for(int key: freq.keySet()){
        int ck = key;
        int cf = freq.get(key);
        if(cf>hf){
            hf = cf;
            hn = ck;
        }
    }
    int lf = Integer.MAX_VALUE;
    int ln = -1;
    for(int key: freq.keySet()){
        int ck = key;
        int cf = freq.get(key);
        if(cf<lf){
            lf = cf;
            ln = ck;
        }
    }
    int ans[] = {hf, lf};
    return ans;
}

void main(String[] args) {
    int arr[] = {1,2,3,3,3,4,4,4,4,5,5,5,5,5};
    int ans[] = univarsal(arr);
    System.out.println(ans[0]);
    System.out.println(ans[1]);
}
