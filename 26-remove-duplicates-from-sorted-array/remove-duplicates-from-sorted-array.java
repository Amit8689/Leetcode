class Solution{
    public int removeDuplicates(int[] nums){
        int k=1;
        int i=1,j=1;
        for(j=1;j<nums.length;j++){
            if(nums[j-1] != nums[j]){
                nums[i]=nums[j];
                i++;
                k++;
            }
        }
        return k;
    }
}








// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int i=0;
//         for(int p=0;p<nums.length;p++){
//             if()
//         }
//         while(j<nums.length){
//             if(nums[j]==nums[i]){
//                 j++;
//             }
//             else{
//                 i++;
//                 nums[i]=nums[j];
//             }
//             j++;
//         }
//     }
// }