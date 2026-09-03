class Solution 
{
    public int differenceOfSum(int[] nums) 
    {
        int element_sum = 0 ;
        int digit_sum = 0 ;
        for(int i = 0 ; i< nums.length ; i++)
        {
            element_sum += nums[i];
        }

        for ( int i = 0 ; i < nums.length ; i++)
        {
            if (nums[i] < 10)
            {
                digit_sum += nums[i];
            }
            else 
            {
                int temp = nums[i];

                while (temp != 0)
                {
                    digit_sum += temp % 10 ;
                     temp = temp / 10;
                }
            }
        }

        return element_sum - digit_sum ;
        
    }
}