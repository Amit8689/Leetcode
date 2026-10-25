class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // sliding window approach
        int minLength=Integer.MAX_VALUE;
        int left =0,right=0;
        int runningSum=0;
        while(right<nums.length){
            runningSum +=nums[right];
            while(runningSum >= target) {
                minLength= Math.min(minLength,right-left+1);
                runningSum -= nums[left];
                left++;
            }
            right++;
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength ;
    }
}



//         for(int i=0;i<nums.length;i++){
//             for(int j=i;j<nums.length;j++){
//                 sum+=nums[j];
//                 if(sum>=target){
//                     if(min<j-i+1){
//                         min=j-i+1;
//                     }
//                 }
//                 }
//             }
//         }
//     }
// }