class Solution 
{
    public String reverseWords(String s) 
    {
        String rev = "";
        String word = "";

        for (int i = s.length() - 1; i >= 0; i--)
        {
            if (s.charAt(i) == ' ')
            {
                if (word.length() > 0)
                {
                    if (rev.length() > 0)
                    {
                        rev += " ";
                    }

                    for (int j = word.length() - 1; j >= 0; j--)
                    {
                        rev += word.charAt(j);
                    }

                    word = "";
                }
            }
            else
            {
                word += s.charAt(i);
            }
        }

        // Process the remaining first word
        if (word.length() > 0)
        {
            if (rev.length() > 0)
            {
                rev += " ";
            }

            for (int j = word.length() - 1; j >= 0; j--)
            {
                rev += word.charAt(j);
            }
        }

        return rev;
    }
}