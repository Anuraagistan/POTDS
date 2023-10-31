class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        int index=0,i=0;
        while(i<n){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
            i++;
        }
        while(index<n){
            arr[index++]=0;
        }
    }
}
