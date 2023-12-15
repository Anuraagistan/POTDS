class Solution 
{ 
    static long countStr(long n)
	{
	    long ans=0;
	    //all a 
	    ans+=1;
	    //all a and 1 b 0c
	    ans+=2*n;
	    // all a and 0b 1c
	    //all a and 0b   2c
	    ans+=(n*(n-1))/2;
	    //all a and 1b and 1c
	    ans+=n*(n-1);
	    // all a 1b and 2c
	    ans+=(n*((n-1)*(n-2)))/2;
	    return ans;
	}
} 
