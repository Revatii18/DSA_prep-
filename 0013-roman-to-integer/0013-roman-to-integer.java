class Solution 
{
    public int romanToInt(String s) 
    {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

       int total = 0 ;
        for (int i = 0 ; i < s.length() - 1 ; i++)
        {
            char ch = s.charAt(i);
            int value = map.get(ch);
            int nextValue = map.get(s.charAt(i + 1));
              if (value < nextValue)
           {
               total = total - value;
            }
         else
          {
              total = total + value;
           }
        } total = total + map.get(s.charAt(s.length() - 1));
        return total ;
    }
}