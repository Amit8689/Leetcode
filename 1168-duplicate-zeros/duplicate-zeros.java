class Solution {
    public void duplicateZeros(int[] arr) {
        int s=0,d=0;
        // int count=0,i=0;
        // while(i<arr.length){
        //     if(arr[i]==0){
        //     count++;
        //     }
        //     i++;
        // }
        int[] dest=new int[arr.length];
        while(s<arr.length){
             if(arr[s]==0){
                if(d<arr.length){
                dest[d]=0;
                d++;
                if(d<arr.length){
                dest[d]=0;
                }
                }
             }else{
                if(d<arr.length){
                dest[d]=arr[s];
                }
             }
             d++;
             s++;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=dest[i];
        }
    }
}