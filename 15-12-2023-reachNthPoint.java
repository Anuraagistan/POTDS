class Solution
{
    public int nthPoint(int n)
    {
        // Code here
        long mod=1000000007;
        if(n==1) return 1;
        long first=1;
        long second=1;
        long curr=first+second;
        for(int i=2;i<=n;i++){
            curr=(second+first)%mod;
            first=second;
            second=curr;
        
        }
        return (int)curr;
    }
}
