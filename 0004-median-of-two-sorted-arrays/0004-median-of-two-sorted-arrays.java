class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] nums3 = new int[n1 + n2];

        // Merge the arrays
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }
        }

        // Add remaining elements from nums1
        while (i < n1) {
            nums3[k++] = nums1[i++];
        }

        // Add remaining elements from nums2
        while (j < n2) {
            nums3[k++] = nums2[j++];
        }

        // Find the median
        int n = n1 + n2;
        if (n % 2 == 1) {
            return nums3[n / 2];
        } else {
            return (nums3[n / 2] + nums3[n / 2 - 1]) / 2.0;
        }
    }
}
