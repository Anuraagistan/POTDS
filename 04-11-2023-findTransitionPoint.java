class Solution {
    int transitionPoint(int arr[], int n) {
        int low=0,high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==1){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]==0){
                low=mid+1;
            }
        }
        return ans;
    }
}
