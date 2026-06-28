class Solution {
    public int tribonacci(int n) {
        int FirstTerm=0,SecondTerm=1,ThirdTerm=1,FourthTerm=0;
        if(n==0){
            return 0;
        }else if(n==1 || n==2){
            return 1;
        }else{
            for(int i=3;i<=n;i++){
                FourthTerm=FirstTerm+SecondTerm+ThirdTerm;
                FirstTerm=SecondTerm;
                SecondTerm=ThirdTerm;
                ThirdTerm=FourthTerm;
            }
        }
        return FourthTerm;
    }
}