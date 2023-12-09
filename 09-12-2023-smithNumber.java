class Solution {
    static boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        double k=Math.sqrt(n);
        for(int i=3;i<=k;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    static int digSum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    static int smithNum(int n) {
        int sum=digSum(n);
        int dSum=0;
        int i=2;
        if(isPrime(n)) return 0;
        while(n>1){
            if(isPrime(i) ){
                while(n>0 && n%i==0 ){
                    if(i>10){
                        dSum+=digSum(i);
                    }
                    else
                    dSum+=i;
                    n=n/i;
                }
            }
             i+=1;
        }
        return sum==dSum ? 1:0;
    }
};
