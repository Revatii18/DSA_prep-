class Solution {
    public void nextPermutation(int[] nums)
    {
       
        int pivot = -1;

        for (int i = nums.length - 2; i >= 0; i--)
        {
            if (nums[i] < nums[i + 1])
            {
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot, reverse entire array
        if (pivot == -1)
        {
            int left = 0;
            int right = nums.length - 1;

            while (left < right)
            {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }

            return;
        }

        // Step 3: Find element greater than pivot and swap
        for (int j = nums.length - 1; j > pivot; j--)
        {
            if (nums[j] > nums[pivot])
            {
                int temp = nums[j];
                nums[j] = nums[pivot];
                nums[pivot] = temp;

                break;
            }
        }

        // Step 4: Reverse the part after pivot
        int left = pivot + 1;
        int right = nums.length - 1;

        while (left < right)
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}