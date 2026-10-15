class Solution {
    public void reverseString(char[] s) {
        char a='x';
        for(int i=0;i<s.length/2;i++){
            a=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=a;
        }
        
        
        // char arr[] = new char[s.length];
        // for(int i=0;i<s.length;i++){
        //     arr[i]=s[s.length-1-i];
        // }
        // for(int i=0;i<s.length;i++){
        //     s[i]=arr[i];
        // }

    }
}