public class Solution {
    public void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length = arr.length - 1;

        // Count the number of zeros to be duplicated
        for (int left = 0; left <= length - possibleDups; left++) {
            if (arr[left] == 0) {
                // Edge case: Check if zero at the edge of array
                if (left == length - possibleDups) {
                    arr[length] = 0; // For the last position
                    length -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        // Start backward from the last element which would be part of the new length
        int last = length - possibleDups;

        // Duplicate zeros from the end
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }
}
