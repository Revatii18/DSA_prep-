class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // 1. Count frequencies
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder res = new StringBuilder();

        // 2. Process highest frequency each time
        while (!map.isEmpty()) {

            int maxFreq = 0;
            char maxChar = '\0';

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {

                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    maxChar = entry.getKey();
                }
            }

            // 3. Add character maxFreq times
            for (int i = 0; i < maxFreq; i++) {
                res.append(maxChar);
            }

            // 4. Don't process this character again
            map.remove(maxChar);
        }

        return res.toString();
    }
}