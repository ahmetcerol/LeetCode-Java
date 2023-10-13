class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = mergeAndSortArrays(nums1, nums2);
        int length = mergedArray.length;

        if (length % 2 == 0) {
            int middle1 = mergedArray[length / 2 - 1];
            int middle2 = mergedArray[length / 2];
            return (double) (middle1 + middle2) / 2.0;
        } else {
            return (double) mergedArray[length / 2];
        }
    }

    public int[] mergeAndSortArrays(int[] n1, int[] n2) {
        int[] n3 = new int[n1.length + n2.length];

        // İlk diziyi n3'e kopyala
        for (int i = 0; i < n1.length; i++) {
            n3[i] = n1[i];
        }

        // İkinci diziyi n3'e kopyala
        for (int i = 0; i < n2.length; i++) {
            n3[n1.length + i] = n2[i];
        }

        // Diziyi sırala
        Arrays.sort(n3);

        return n3;
    }
}
