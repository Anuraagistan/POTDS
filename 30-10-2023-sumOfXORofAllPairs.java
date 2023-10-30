class Solution{
   
    // Function for finding maximum and value pair
    public long sumXOR (int arr[], int n) {
        //Complete the function
        long ans=0;
       for(int i=0;i<32;i++){
           long oneC=0,zeroC=0;
           for(int j=0;j<n;j++){
               if((arr[j]&1)==0) zeroC++;
               else oneC++;
               arr[j]=arr[j]>>1;
           }
           ans+=oneC*zeroC*(1<<i);
       }
        return ans;
    }
    
    
}
