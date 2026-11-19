
//https://www.geeksforgeeks.org/problems/find-unique-number/1

class Solution {
    public int findUnique(int[] arr) {
        // code here
        int chodu = 0;
        for(int i: arr){
            chodu = chodu ^ i;
        }
        return chodu;
    }
}
