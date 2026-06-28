class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp=x;
        int rev=0;
        while(temp>0){
            rev=(10*rev)+(temp%10);
            temp=temp/10;
        }
        if(x==rev){
            return true;
        }
        else{
            return false;
        }
    }
}