class Solution {
    public int maxAdjacentDistance(int[] nums) 
    {
     int largest = Integer.MIN_VALUE;
     int diff = 0 ;
  for (int i = 0 ; i <= nums.length -1  ; i++)
  {

    if (i == nums.length-1)
    {
         diff = Math.abs(nums[i] - nums[0] );
    }
    else
    {
         diff =  Math.abs(nums[i] - nums[i+1]);
    }

    if (largest < diff)
    {
         largest = diff ;
    }
  }
        return largest ; 
    }
}