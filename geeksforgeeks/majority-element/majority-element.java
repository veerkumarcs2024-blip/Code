class Solution {
    static int majorityElement(int[] arr) {
        int candidate = 0;
        int count = 0;

        // Find candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Verify candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        return count > arr.length / 2 ? candidate : -1;
    }
}