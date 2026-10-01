import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Pass 1: count every character
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);   // fix 1: default is 0
        }

        // Pass 2: first character whose count is 1
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {          // fix 2: compare with count 1
                return i;                              // fix 3: return the index
            }
        }
        return -1;                                     // no unique character
    }
}