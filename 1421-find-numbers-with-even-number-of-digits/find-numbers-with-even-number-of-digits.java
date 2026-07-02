// class Solution {
//     public int findNumbers(int[] nums) {
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             String s = Integer.toString(nums[i]);
//             if(s.length()%2==0){
//                 count++;
//             }
//         }
//         return count;
//     }
// }

//method 2:

class Solution {
    public boolean IsEven(int x){
        int digit=0;
        while(x>0){
            digit++;
            x=x/10;
        }
        if(digit%2==0){
            return true;
        }else{
            return false;
        }

    }
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(IsEven(nums[i])){
                count++;
            }
        }
        return count;
    }
}