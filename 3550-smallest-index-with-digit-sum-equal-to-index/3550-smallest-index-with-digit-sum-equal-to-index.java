class Solution
{
    public int smallestIndex(int[] nums) 
    {
        int numlen = nums.length;
        for (int i = 0 ; i <= numlen-1  ; i++)
        {
            if(nums[i]< 10)
            {
                if(nums[i] == i)
                {
                    return i;
                }
            }
            else 
            {
                 int temp = nums[i];
int sum = 0;

while (temp != 0)
{
    sum += temp % 10;
    temp = temp / 10;
}

if (sum == i)
{
    return i;
}

            } }     return -1;
    }
}