import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Put all elements into set
        for (int x : nums) {
            set.add(x);
        }

        int longest = 0;

        // Check each unique element
        for (int x : set) {

            // x is the beginning of a sequence
            if (!set.contains(x - 1)) {

                int count = 1;
                int current = x + 1;

                // Keep extending the sequence
                while (set.contains(current)) {
                    count++;
                    current++;
                }

                // Update maximum
                if (count > longest) {
                    longest = count;
                }
            }
        }

        return longest;
    }
}