class Solution {
    public boolean detectCapitalUse(String word)
     {

       /*boolean res = false  ;
        for ( int i = 0 ; i < word.length() ; i++)
        {
            
            if ( Character.isUpperCase(word.charAt(i)))
            {
                res = true ;
            }
        } 
        return res ; */
        return word.equals(word.toUpperCase()) ||
       word.equals(word.toLowerCase()) ||
       Character.isUpperCase(word.charAt(0)) &&
       word.substring(1).equals(word.substring(1).toLowerCase());
        
    }
}