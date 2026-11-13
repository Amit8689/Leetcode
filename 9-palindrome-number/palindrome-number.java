class Solution {
    public boolean isPalindrome(int n) {
         int copy=n,
             reverse=0;
        int x;
        while(copy>0){
            x=copy%10;
            reverse=reverse*10 + x;
            copy/=10;
        }
        if(n==reverse){
            return true;
        }
        return false;
    }
}