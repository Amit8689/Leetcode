class Solution{
    public String addBinary(String a, String b) {
        
        if(a.length() < b.length()){
            return addBinary(b,a);

        }
        StringBuilder res=new StringBuilder();

        int m=a.length(), n=b.length();
        int carry=0,sum=0;
        int j=n-1;
        for(int i=m-1;i>=0;i--){
            sum=carry;
            if(a.charAt(i) == '1'){
                sum += 1;
            }else{
                sum+=0;
            }
            if(j>=0 && b.charAt(j) == '1'){
                sum += 1;
            }else{
                sum+=0;
            }
            carry = sum/2;


            res.append(sum%2);
            j--;
        }
        if(carry==1){
            res.append(carry);
        }
        res.reverse();
        return res.toString();
    }
}