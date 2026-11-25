//https://leetcode.com/problems/sqrtx/

class Solution {
    public int mySqrt(int x) {

        int s =1;
        int e = x;
        int ans = -1;

        if(x ==0 ){
            return 0;
        }

        while(s<=e){
            int mid = s+(e-s)/2;

            if(mid == x/mid){
                return mid;
            }
            else if(mid>x/mid){
                e = mid-1;  
            }
            else{
                ans=mid;
                s=mid+1;
            }
        }
      return ans;
    }
}

//agar precision value find karni ho to
        double factor  = 1;
        int totalprecision = 3;
        for(int r = 1; r<=tp; r++){
            factor = factor/10;
            for(int i=0; i<=10; i++){
                double na = ans + factor;

                if(na*na < x){
                     ans = na;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(ans);
