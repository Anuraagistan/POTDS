class Solution{
    
    static long countSubarrays(int a[], int n, int L, int R)  
    { 
        // Complete the function
        long lessL=0,lessEqualR=0;
        int i=0,j=0;
        for(i=0;i<n;i++){
            if(a[i]<L){
                lessL+=(i-j+1);
            }
            else{
                j=i+1;
            }
        }
        j=0;
        for(i=0;i<n;i++){
            if(a[i]<=R){
                lessEqualR+=(i-j+1);
            }
            else{
                j=i+1;
            }
        }
        return lessEqualR-lessL;
    } 
}

