
class Solution {
    public int strStr(String haystack, String needle) {

        if (haystack.length() < needle.length()) {
            return -1;
        }

        int i = 0, j = 0;

        while (i <= haystack.length() - needle.length()) {

            while (j < needle.length()) {

                if (haystack.charAt(i) != needle.charAt(j)) {
                    if (j != 0) {
                        i = i - j;
                    }
                    j = 0;
                    break;
                } else {
                    j++;
                    i++;
                }
            }

            if (j == needle.length()) {
                return i - j;
            }

            i++;
        }

        return -1;
    }
}




// class Solution {
//     public int strStr(String haystack, String needle) {
//         if(haystack.length() < needle.length()){
//             return -1;
//         }
//         int i=0,j=0;
//         while(i<=haystack.length()-needle.length()){
//             while(j<needle.length()){
//                 if(haystack.charAt(i) != needle.charAt(j)){
                    
//                     if(j !=0){
//                         i=i-1;
//                     }
//                     j=0;
//                     break;
//                 }else{
//                     j++;
//                     i++;
//                 }  
//             }
//             i++;
//             if(j==needle.length()){
//                 return i-j-1;
//             }
            
//         }
//         return -1;
//     }
// }