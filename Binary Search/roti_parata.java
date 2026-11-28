
static boolean iva(int cook[], int p, int n, int mid){
    int pc = 0;
    for(int i=0; i<cook.length; i++){
        int ccr = cook[i];
        int j = 1;
        int tt = 0;
        while(tt <= mid){
            if(tt+j*ccr <= mid){
                tt = tt + j*ccr;
                pc++;
                j++;
            }
            else{
                break;
            }
        }
        if(pc>= p){
            return true;
        }
    }
    if(pc>=p){
        return true;
    }
    else{
        return false;
    }
}

static int paratha(int[]cook, int p, int n){
    int max =-1;
    for(int i=0; i<cook.length; i++){
        if(cook[i] > max){
            max = cook[i];
        }
    }
    int s = 0;
    int e = max*(p*(p+1)/2);
    int ans =-1;
    while(s<=e){
        int mid  = s+(e-s)/2;
        if(iva(cook,p,n,mid)){
            ans = mid;
            e = mid-1;
        }
        else{
            s = mid+1;
        }
    }
    return ans;
}

void main(String[] args) {
    int cook[] = {1,2,3};
    int p = 10;
    int n = 4;
    System.out.println(paratha(cook,p,n));
}
