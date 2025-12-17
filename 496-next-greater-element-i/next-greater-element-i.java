class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int n = nums1[i];
            int k=0;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==n){
                    k=j;
                    break;
                }
            }
            boolean found=false;
            for(int m=k;m<nums2.length;m++){
                if(nums2[m]>n){
                    ans[i]=nums2[m];
                    found=true;
                    break;
                }
            }
            if(!found) ans[i]=-1;
        }
        return ans;
    }
}