class Solution
 {
    public int[] searchRange(int[] nums, int target)
    {
        int left = 0;
        int right = nums.length - 1;
        int start = -1;

   while (left <= right)
  {
      int mid = left + (right - left) / 2;

       // three cases

      if (nums[mid] == target) 
      {
           start = mid;
         right = mid - 1;
      }
      else if (nums[mid] < target) 
       {
        
        left = mid + 1 ;

       }

       else if (nums[mid] > target)
       {
         right = mid - 1 ;
       }
  }

    left = 0;
    right = nums.length - 1;
    int end = -1 ;
  // end 
   while (left <= right)
  {
      int mid = left + (right - left) / 2;

       // three cases

      if (nums[mid] == target) 
      {
           end = mid;
           left = mid + 1 ;
      }
      else if (nums[mid] < target) 
       {
        
        left = mid + 1 ;

       }

       else if (nums[mid] > target)
       {
         right = mid - 1 ;
       }
  }

     int [] arr = { start , end} ;
       return arr ;
    }
}