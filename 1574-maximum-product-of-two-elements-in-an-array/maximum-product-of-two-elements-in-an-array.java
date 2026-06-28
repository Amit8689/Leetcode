class Solution {
    public int maxProduct(int[] nums) {
        int Max=0;
        int Smax=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=Max){
                Smax=Max;
                Max=nums[i];
            }else if(nums[i]>Smax){
                Smax=nums[i];
            }
        }
        return (Max-1)*(Smax-1);
    }
}