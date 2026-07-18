class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length,temp=-1;
        int brr[] =new int[n];
        brr[n-1]=-1;
        for(int i=n-1;i>=0;i--){
            if(i-1>=0){
                if(arr[i]>temp){
                    brr[i-1]=arr[i];
                    temp=arr[i];
                }else{
                    brr[i-1]=temp;
                }
            }
        }
        return brr;
    }
}