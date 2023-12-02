class Solution
{
    static int isRepresentingBST(int arr[], int N)
    {
        int maxx=arr[0];
        for(int i=1;i<N;i++){
            if(arr[i]<maxx) return 0;
            maxx=Math.max(maxx,arr[i]);
        }
        return 1;
    }
}
