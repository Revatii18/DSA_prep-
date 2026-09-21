class Solution {
    public String longestCommonPrefix(String[] strs) {

        String result = "";

        for (int i = 0; i < strs[0].length(); i++) {

            char ch = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {

                // If current string is shorter
                if (i >= strs[j].length()) {
                    return result;
                }

                // If characters don't match
                if (ch != strs[j].charAt(i)) {
                    return result;
                }
            }

            // Character matched in all strings
            result = result + ch;
        }

        return result;
    }
}