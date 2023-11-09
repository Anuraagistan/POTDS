class Solution
{
    int columnWithMaxZeros(int a[][], int n)
    {
        // code here
        int maxx=-1,ans=0;
        for(int i=0;i<n;i++){
            int thisColumn=0;
            for(int j=0;j<n;j++){
                if(a[j][i]==0){
                    thisColumn+=1;
                }
            }
            if(thisColumn>maxx){
                maxx=thisColumn;
                ans=i;
            }
        }
        if(maxx==0) return -1;
        return ans;
    }
}
