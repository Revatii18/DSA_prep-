class Solution 
{
    public int sumOfGoodNumbers(int[] nums, int k) 
    {
         int sum = 0 ;
         int n = nums.length ;
         boolean isGoodSum ;
      for ( int i = 0 ; i <= n-1 ; i ++ )
   {
    isGoodSum = true ; 
     
     if ( i - k >= 0 ) 
     {
        if (nums[i] <= nums[i-k]) 
        {
           isGoodSum = false;
        }
     }
     if (i + k <= n -1  )
      {
         if (nums[i] <= nums[i+k]) 
         {
           isGoodSum = false;
          }

     }
  if (isGoodSum)
{
sum += nums[i];
}}

return sum ;

    }
}