class Solution {
    public void reverse(char arr[], int start, int end){
        while(start < end){
            char temp=arr[start];
            arr[start]=arr[end-1];
            arr[end-1]=temp;
            
            start++;
            end--;
        }
    }
    public String reverseWords(String s) {
        char[] Arr= s.toCharArray();
        int start=0,end=0;
        
        //Mr Ding
        //s
        //  e

        while(start<Arr.length){
            while(end < Arr.length && Arr[end]!=' '){
                end++;
            }
            //reverse 
            reverse(Arr,start,end);

            start=end+1;
            end= start;
        }
        return new String(Arr);
    }
}