class Solution
 {
    public boolean isPalindrome(int x)
{
    // 1. Store original number
    int orignal = x ;

    // 2. Initialize reverse
    int rev = 0 ;
     if(x < 0)
     {
        return false ;
     }
    // 3. Reverse the number using while loop
    while ( x != 0 )
    {
        int digit = x % 10 ;
        rev = rev * 10 + digit ;
        x = x / 10 ;
    }

    // 4. Compare original and reverse
    if (orignal == rev ) 
    {
        return true ;
    }

    // 5. Return true or false
    return false ;
}
}
         
