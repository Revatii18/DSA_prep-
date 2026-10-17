import java.util.HashMap;

class Solution {
    public int maxNumberOfBalloons(String text) {

        HashMap<Character, Integer> map = new HashMap<>();
        int smallest = Integer.MAX_VALUE;

        // Step 1: count every character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: balloons each letter can support
        int b = map.getOrDefault('b', 0) / 1;
        int a = map.getOrDefault('a', 0) / 1;
        int l = map.getOrDefault('l', 0) / 2;
        int o = map.getOrDefault('o', 0) / 2;
        int n = map.getOrDefault('n', 0) / 1;

        // Step 3: smallest of the five
        smallest = Math.min(smallest, b);
        smallest = Math.min(smallest, a);
        smallest = Math.min(smallest, l);
        smallest = Math.min(smallest, o);
        smallest = Math.min(smallest, n);

        return smallest;
    }
}