class Solution {
    int isPresent(int num,int X,int count){
        while(num>0){
            int temp=num%10;
            if(temp==X) count++;
            num/=10;
        }
        return count;
    }
    int countX(int L, int R, int X) {
        int ans=0;
        for(int i=L+1;i<R;i++){
            ans+=isPresent(i,X,0);
        }
        return ans;
    }
};
