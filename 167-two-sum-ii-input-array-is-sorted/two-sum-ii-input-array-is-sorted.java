class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans=new int[2];
        int index1=0;
        int index2=numbers.length-1;
        while(index1<=index2){
            int mix=numbers[index1]+numbers[index2];
            if(mix==target){
                ans[0]=index1+1;
                ans[1]=index2+1;
                break;
            }
            else if(mix<target){
                index1++;
            }
            else{
                index2--;
            }
        }
        return ans;
    }
}