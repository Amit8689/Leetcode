class Solution {
    public int fib(int n) {
        int firstTerm=0,SecondTerm=1;
        int ThirdTerm=0;
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            for(int i=2;i<=n;i++){
                ThirdTerm=firstTerm+SecondTerm;
                firstTerm=SecondTerm;
                SecondTerm=ThirdTerm;
            }
            return ThirdTerm;
        }
    }
}