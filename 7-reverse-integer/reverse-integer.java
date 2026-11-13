class Solution {
    public int reverse(int n) {
        int copy=Math.abs(n);
        long rev=0;
        int x;
        while(copy>0){
            x=copy%10;
            rev=rev*10 + x;
            copy/=10;
        }
        if (rev > Integer.MAX_VALUE ||
            rev < Integer.MIN_VALUE) {
            return 0;
        }

        if(n<0){
            return (int) -rev;
        }
        return (int) rev;
    }
}