class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int lx=-1;
        int ly=-1;
        int i=0;
        int ans=Integer.MAX_VALUE;
        while(i<n){
            if(a[i]==x){
                lx=i;
            }
            if(a[i]==y){
                ly=i;
            }
            if(lx!=-1 && ly!=-1){
                ans=Math.min(ans,Math.abs(lx-ly));
            }
            i++;
        }
        if(lx==-1 || ly==-1) return -1;
        return ans;
    }
}
