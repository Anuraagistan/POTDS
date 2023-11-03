class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here
        ArrayList<Double> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!list.contains(Double.valueOf(arr[i]))){
                list.add(Double.valueOf(arr[i]));
            }
        }
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                double as=list.get(i)*list.get(i);
                double bs=list.get(j)*list.get(j);
                if(list.contains(Math.sqrt(as+bs))) return true;
            }
        }
        return false;
    }
}
