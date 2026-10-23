class Solution {
    public void rotate(int[] nums, int k) {
        int i=0;
        int arr[]=new int[nums.length];
        while(i<nums.length){
            arr[(i+k)%nums.length ]=nums[i];
            i++;
        }
        i=0;
        while(i<nums.length){
            nums[i]=arr[i];
            i++;
        }
    }
}