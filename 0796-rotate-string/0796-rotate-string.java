class Solution 
{
    public boolean rotateString(String s, String goal) 
    {
         if(s.length() == goal.length() )
     {
         String ss = s + s ;
           if ( (ss).contains(goal) )
         {
            return true ; 
         }
         else return false ;
    }
      else return false ;
    }
}
    
