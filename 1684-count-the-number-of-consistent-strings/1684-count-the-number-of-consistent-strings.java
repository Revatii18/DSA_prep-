class Solution {
    public int countConsistentStrings(String allowed, String[] words) 
    {
        boolean[] arr = new boolean[26];
        int count = 0;

        // Store allowed characters
        for (int i = 0; i < allowed.length(); i++)
        {
            arr[allowed.charAt(i) - 'a'] = true;
        }

        // Check each word
        for (int i = 0; i < words.length; i++)
        {
            boolean isValid = true;

            for (int j = 0; j < words[i].length(); j++)
            {
                if (!arr[words[i].charAt(j) - 'a'])
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