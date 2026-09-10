class Solution {
    public int smallestEqual(int[] nums) 
    {
       int smallest = Integer.MAX_VALUE ;
        for (int i = 0 ; i < nums.length ; i++)
        {
            if( i % 10 == nums[i])
            {
                 if (i < smallest)
                {
                  smallest = i;
                 }
            }

        } 
        if(smallest == Integer.MAX_VALUE)
        {
            return -1 ;
        }
        return smallest ;
    }
}