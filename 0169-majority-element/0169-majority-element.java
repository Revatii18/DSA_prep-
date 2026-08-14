class Solution {
    public int majorityElement(int[] nums)
     {
        int majority = 0 ;
        int n  = nums.length;
        for ( int i = 0 ; i <=  n-1 ; i++ )
     {
          int count = 1 ;
           for ( int j = i+ 1 ;j <= n-1 ; j ++) 
          {
            if ( nums[i] == nums[j] ) 
               { 
                  count ++ ;
                }
          }
         if (count > n/2 )
         {
          majority  = nums[i]  ; 
         }
           
    } return majority   ; 
} }