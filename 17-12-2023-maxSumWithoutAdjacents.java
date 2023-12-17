class Solution {
    int findMaxSum(int nums[], int n) {
        // code here
        int norob=0;
        int rob=0;
        for(int i=0;i<nums.length;i++){
           int nrob=norob+nums[i];
           int nnorob=Math.max(norob,rob);
           rob=nrob;
           norob=nnorob;
        }
        return Math.max(rob,norob);
    }
}
