class Solution {
    public int countConsistentStrings(String allowed, String[] words) 
    {
        HashSet<Character> set = new HashSet<>();
        int count = 0;

        // Store allowed characters
        for (int i = 0; i < allowed.length(); i++)
        {
            set.add(allowed.charAt(i));
        }

        // Check each word
        for (int i = 0; i < words.length; i++)
        {
            boolean isValid = true;

            for (int j = 0; j < words[i].length(); j++)
            {
                if (!set.contains(words[i].charAt(j)))
                {
                    isValid = false;
                    break;
                }
            }

            if (isValid)
            {
                count++;
            }
        }

        return count;
    }
}