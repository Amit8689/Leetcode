// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) { 
//         for(int i=0;i<n;i++){
//             nums1[i+m]=nums2[i];
//         }
//         Arrays.sort(nums1);
//     }
// }

// optimal solution: 
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m];
        for(int i=0;i<m;i++){
            merged[i]=nums1[i];
        }
        int p1=0;
        int p2=0;
        for(int i=0;i<nums1.length;i++){
            if(p2>=n || (p1<m && merged[p1]<=nums2[p2])){
                nums1[i]=merged[p1];
                p1++;
            }else{
                nums1[i]=nums2[p2];
                p2++; 
            }
        }
    }
}