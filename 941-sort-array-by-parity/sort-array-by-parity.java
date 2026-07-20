class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0,  j = 0, temp = 0;
        while(j<nums.length){
            if(nums[j]%2 != 0){
                j++;
            }else{
                temp = nums[i];
                nums[i] = nums [j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
        return nums;
    }
}