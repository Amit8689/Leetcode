class Solution {
    public int[] plusOne(int[] digits) {

        for(int i= digits.length-1; i>=0;i--){
            if(digits[i] != 9){
                digits[i] += 1;
                return digits;
            }else{
                digits[i]=0;
            }
        }

        // 9,9
        // 0,0
        // 1,0,0    because initializing an array means all elements are zero
        int newArr[] = new int[digits.length+1];
        newArr[0]=1;
        digits=newArr;

        return digits;
    }
}