class Solution
{
    boolean isPrime(int N){
        if(N<=1) return false;
        if(N==2) return true;
        if(N%2==0) return false;
        double n=Math.sqrt(N);
        for(int i=3;i<=n;i++){
            if(N%i==0) return false;
        }
        return true;
    }
    int nextPrime(int N){
        if(isPrime(N)) return N;
        else return nextPrime(N+1);
    }
    public int minNumber(int arr[], int N)
    {
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        int target=nextPrime(sum);
        return target-sum;
    }
}
