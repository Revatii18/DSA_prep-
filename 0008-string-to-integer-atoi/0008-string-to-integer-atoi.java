class Solution {
    public int myAtoi(String s) 
    {
        int i = 0;
        int sign = 1;
        long  num = 0;      

  if (s.length() == 0) return 0;
        // Step 2: Skip spaces
        while (i < s.length() && s.charAt(i) == ' ') 
        {
            i++;
        }

        // Step 3: Handle sign
        if (i < s.length() && s.charAt(i) == '-')
        {
            sign = -1;
            i++;
        } 
        else if (i < s.length() && s.charAt(i) == '+') 
        {
            sign = 1;
            i++;
        }
        // add digits 
        while (i < s.length() && Character.isDigit(s.charAt(i)))
        {
             int digit = s.charAt(i) - '0';  // 4 -- > 52 - 48 =  4 
             num = num * 10 + digit;

      if (num * sign > Integer.MAX_VALUE) 
      {
        return Integer.MAX_VALUE;
     }
    if (num * sign < Integer.MIN_VALUE) 
    {
        return Integer.MIN_VALUE;
    }
      i++; 
 }
       return (int) (num * sign);
    }
}