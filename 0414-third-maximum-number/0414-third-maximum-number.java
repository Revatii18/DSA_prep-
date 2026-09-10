class Solution 
{
    public int thirdMax(int[] nums) 
    {
        long first = Long.MIN_VALUE;
        long sec = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        int  count = 0 ;
      for ( int i = 0 ; i < nums.length ; i++)
      {
          if (nums[i] > first)
            {
                third = sec;
                sec = first;
               first = nums[i];
               count++ ;
            }
        else if (nums[i] < first && nums[i] > sec)
            {
                third = sec;
               sec = nums[i];
               count++ ;
            }
         else if (nums[i] < sec && nums[i] > third)
            {
               third = nums[i];
               count++;
            }

     }
     if (count > 2)
     {
        return (int)third ;
     }
     return (int)first ;
}
}