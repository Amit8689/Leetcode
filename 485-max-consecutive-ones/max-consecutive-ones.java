class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int count=0,max=0;
        while(i<nums.length){
            if(nums[i]==1){
                count+=1;
            }
            if(nums[i]==0 || i==nums.length-1){
                if(max<count){
                    max=count;
                }
                count=0;
            }
            i++;
        }
        return max;
    }
}