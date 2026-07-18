class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i] != 0){
                arr[j]=nums[i];
                j++;
            }
        }
        while(j<n){
            arr[j]=0;
            j++;
        }
        j=0;
        while(j<n){
            nums[j]=arr[j];
            j++;
        }
    }
}