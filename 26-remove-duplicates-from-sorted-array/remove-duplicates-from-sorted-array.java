class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0,right=0,k=1;
        while(right<nums.length){
            if(nums[left]==nums[right]){
                right++;
            }else if(nums[left] != nums[right]){
                left++;
                nums[left]=nums[right];
                right++;
                k++;
            }
        }
        return k;
    }
}