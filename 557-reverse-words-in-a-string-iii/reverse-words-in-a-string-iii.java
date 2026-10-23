class Solution {
    public String reverseWords(String s) {
        int start=0,end=0;
        StringBuilder sb = new StringBuilder();

        while(start < s.length()){
            sb.append(s.charAt(start));
            start++;
        }
        start=0;
        int x=0;
        while(start < s.length()){
            while(end < s.length() && s.charAt(end) != ' '){
                end++;
            }
            x=end-1;
            while(start < x){
                char temp=s.charAt(start);
                sb.setCharAt(start,s.charAt(x));
                sb.setCharAt(x,temp);
                start++;
                x--;
            }
            start=end+1;
            end=start;

        
        }
    return sb.toString();
    }
}