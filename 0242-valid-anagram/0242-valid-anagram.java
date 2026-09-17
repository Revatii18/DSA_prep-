class Solution {
    public boolean isAnagram(String s, String t) 
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray())
      {
           map.put(ch, map.getOrDefault(ch, 0) + 1);
      }
      for (char chh : t.toCharArray())
      {
           map.put(chh, map.getOrDefault(chh, 0) - 1);
      }
      for (int count : map.values())
   {
       if (count != 0)
    {
        return false;
    }
}

return true;
        
    }
}