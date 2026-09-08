class Solution 
{
    public int singleNonDuplicate(int[] nums)
    {
        int left = 0 ;
        int right = nums.length - 1 ;
        while ( left < right)
        {
            int mid = left + ( right - left) / 2 ;
            int partner = (mid % 2 == 0) ? mid + 1 : mid - 1 ;
            if (nums[mid] == nums[partner])
            {
                 left = Math.max(mid , partner) + 1 ;
            }
            else 
            {
                right = Math.min(mid , partner);
            }
        }
        return nums[left];
        
    }
}