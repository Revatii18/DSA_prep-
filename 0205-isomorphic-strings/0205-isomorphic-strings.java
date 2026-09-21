import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();     // s char -> t char
        Map<Character, Character> mapchk = new HashMap<>();  // t char -> s char

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (map.containsKey(a)) {
                if (map.get(a) != b) {
                    return false;
                }
            } else {
                if (mapchk.containsKey(b)) {
                    return false;
                }
                map.put(a, b);
                mapchk.put(b, a);
            }
        }
        return true;
    }
}