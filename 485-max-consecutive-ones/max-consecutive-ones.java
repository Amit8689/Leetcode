class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,j=0;
        int k=0;
        while(i<nums.length){
            if(nums[i]==1){
                k=k+1;
            }
            if(nums[i]==0 || i==nums.length-1){
                if(j<k){
                    j=k;
                }
                k=0;
            }
            i++;
        }
        return j;
    }
}