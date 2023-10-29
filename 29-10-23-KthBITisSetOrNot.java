class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        // Your code here
        int num=1;
        while(k>0){
            num=num<<1;
            k-=1;
        }
        num=num&n;
        if(num==0) return false;
        else return true;
    }
    
}
