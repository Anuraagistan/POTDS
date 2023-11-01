class Solution{
    public static void frequencyCount(int arr[], int N, int p)
    {
        int offset=p+1;
        for(int i=0;i<N;i++){
            int idx=arr[i]%offset-1;
            if(idx>=0 && idx<N ){
                arr[idx]+=offset;
            }
        }
        for(int i=0;i<N;i++){
            arr[i]/=offset;
        }
    }
}
