class Solution {
    //function
        public int getCommonCountMatchCharacters(String s1,String s2){
            if(s1.length()==0 || s2.length()==0){
                return 0;
            }
            if(s1.length() > s2.length()){
                return getCommonCountMatchCharacters(s2,s1);
            }
            int count=0;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i) == s2.charAt(i)){
                    count++;
                }else{
                    return count;
                }
            }
            return count;
        }
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        int min=Integer.MAX_VALUE;
        String first=strs[0];
        for(int i=1;i<strs.length;i++){
            min= Math.min(min,getCommonCountMatchCharacters(first ,strs[i]));
        }
        return first.substring(0,min);
    }
}