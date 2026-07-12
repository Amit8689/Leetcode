class Solution {
    public boolean validMountainArray(int[] arr) {
        int peak=0,i=0;
        if(arr.length<3){
            return false;
        }
        while(i+1<arr.length && arr[i]<arr[i+1]){
            i++;
        }
        //now i is theelement from where the mountain start reducing
        if(i==0 || i== arr.length-1){
            return false;
        }
        while(i+1<arr.length && arr[i]>arr[i+1]){
            i++;
        }
        return i==arr.length-1;
    }
}