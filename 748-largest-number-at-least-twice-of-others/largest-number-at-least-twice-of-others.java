class Solution {
    public int dominantIndex(int[] nums) {
        int max=nums[0];
        int max_idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(max== nums[i]){
                max_idx=i;
                continue;
            }
            else if(max < 2*nums[i]){
                return -1;
            }
        }
        return max_idx;
    }
}