class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] merged = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        // Merge both sorted arrays
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Copy remaining elements of nums1
        while (i < m) {
            merged[k++] = nums1[i++];
        }

        // Copy remaining elements of nums2
        while (j < n) {
            merged[k++] = nums2[j++];
        }

        int total = m + n;

        // Odd number of elements
        if (total % 2 == 1) {
            return merged[total / 2];
        }

        // Even number of elements
        int mid1 = merged[total / 2 - 1];
        int mid2 = merged[total / 2];

        return (mid1 + mid2) / 2.0;
    }
}