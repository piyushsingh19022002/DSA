class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        // using three pointers and start filling from last
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // if in case loop broken by i and nums2 has element then
        // and if loop broken by j then remainning of element of nums1 are already sorted

        while(j>=0){
            nums1[k] = nums2[j];
            j--;k--;
        }
    }
}