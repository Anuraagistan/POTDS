class Solution
{
    long countWays(int n,int k)
    {
        //code here.
       if(n==1) return k;
        long modd=1000000007;
        long ii=k%modd;
        long ij=(k%modd*(k-1)%modd)%modd;
        long total=(ii%modd+ij%modd)%modd;
        for(int i=3;i<=n;i++){
            ii=ij%modd;
            ij=(total*(k-1))%modd;
            total=ii%modd+ij%modd;
        }
        return total%modd;
        
    }
}
