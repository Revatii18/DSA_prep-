class Solution
 {
    public boolean canAliceWin(int[] nums)
    {
        int n = nums.length ;
        int singleDsum = 0 ;
        int doubleDsum = 0 ;
        for ( int i = 0 ; i < n ; i++)
        {
            if (nums[i] >= 10)
            {
                doubleDsum += nums[i];

            }
             else singleDsum += nums[i];

        }
        if    (singleDsum == doubleDsum  )
        {
            return false ;
        }
        else return true ;
    }
}