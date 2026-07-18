// here is optimal solution using 2 pointer approach
class Solution {
    public void moveZeroes(int[] nums) {
        int slow=0,fast=0;
        while(fast<nums.length){
            if(nums[fast] != 0){
                nums[slow]=nums[fast];
                slow++;
                fast++;
            }else{
                fast++; 
            }
        }
        while(slow<nums.length){
            nums[slow]=0;
            slow++;
        }
    }
}

// class Solution {
//     public void moveZeroes(int[] nums) {
//         int n=nums.length;
//         int[] arr=new int[n];
//         int j=0;
//         for(int i=0;i<n;i++){
//             if(nums[i] != 0){
//                 arr[j]=nums[i];
//                 j++;
//             }
//         }
//         while(j<n){
//             arr[j]=0;
//             j++;
//         }
//         j=0;
//         while(j<n){
//             nums[j]=arr[j];
//             j++;
//         }
//     }
// }

