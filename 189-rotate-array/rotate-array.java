class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[(i+k)%nums.length]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }









        // int i=nums.length-2;
        // while(k>0){
        //     int lastNum=nums[nums.length-1];
        //     for(i=nums.length-2;i>=0;i--){
        //         nums[i+1]=nums[i];
        //     }
        //         nums[i+1]=lastNum;
        //     k--;
        // }
    }
}