class Solution {
    long countStrings(int n) {
        // code here
        if(n==1) return 2;
        long prev1=1;
        long prev0=2;
        long total=prev1+prev0;
        long modd=1000000007;
        for(int i=3;i<=n;i++){
          long newOne=prev0;
          long newZero=(prev0+prev1)%modd;
          prev0=newZero;
          prev1=newOne;
            total=(prev1+prev0)%modd;
        }
        return total;
    }
   
}
