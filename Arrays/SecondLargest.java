class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int l=arr[0];
        int s=-1;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>l){
                s=l;
                l=arr[i];
            }
            if(arr[i]<l && arr[i]>s){
                s=arr[i];
            }
            
        }
        return s;
        
    }
}
