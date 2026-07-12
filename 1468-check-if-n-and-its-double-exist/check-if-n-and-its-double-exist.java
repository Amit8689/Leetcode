class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean a=false;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(2*arr[i]) || (set.contains(arr[i]/2) && arr[i]%2==0)){
                a=true;
            }else{
                set.add(arr[i]);
            }
        }
        return a;
    }
}