class Solution {
    public boolean isSorted(int[] nums) {
        // code here
         for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
}
