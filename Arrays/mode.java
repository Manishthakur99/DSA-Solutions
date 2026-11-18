static int univarsal(int[] arr){
    HashMap<Integer, Integer> freq = new HashMap<>();
    for(int num: arr){
        freq.put(num, freq.getOrDefault(num,0)+1);
    }
    int maxfreq  = -1;
    int maxfreqkey = -1;
    for(int key: freq.keySet()){
            int currentkey = key;
            int currentkeyfreq = freq.get(key);
            if(currentkeyfreq > maxfreq){
                 maxfreq = currentkeyfreq;
                 maxfreqkey = currentkey;
            }

    }
    return maxfreqkey;
}

void main(String[] args) {
    int arr[] = {1,2,3,3,3,4,4,4,4,5,5,5,5,5};
    System.out.println(univarsal(arr));
}
