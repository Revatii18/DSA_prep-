
import java.util.*;

class Solution 
{
    public boolean wordPattern(String pattern, String s) 
    {
        // aabd = cat dog bat owl ( 4 == 4)
        
          String[] arr = s.split(" ");
        if(pattern.length() != arr.length)
        {
            return false ;
        }
         HashMap< Character, String> map = new HashMap<>();

         for (int i = 0 ; i < pattern.length() ; i++)
         {
            char ch = pattern.charAt(i);
            if(map.containsKey(ch))   // a -- > a 
            {
                if( !map.get(ch).equals (arr[i]) )
                {
                    return false ;
                }
            }
            else 
            {
                if(map.containsValue(arr[i]))
                {
                    return false;
                }
                map.put(ch , arr[i]);
            }
            
         }
return true ;

    }
}
