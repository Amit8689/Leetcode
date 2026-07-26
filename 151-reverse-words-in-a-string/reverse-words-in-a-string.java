class Solution {
    public String reverseWords(String s) {
        //"  hello world  "
        String TrimmedString=s.trim();
        //"hello world"
        String[] arrStr=TrimmedString.split("\\s+");
        //["hello","world"]
        List<String> ListStr= Arrays.asList(arrStr);
        //<"hello","world">
        Collections.reverse(ListStr);
        //<"world","hello">
        return String.join(" ",ListStr);
    }
}