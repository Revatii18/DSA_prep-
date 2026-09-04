class Solution
 {
    public int[] rearrangeArray(int[] nums) 
    {
        int [] negative = new int [nums.length /2] ;
        int [] positive = new int [nums.length /2] ;
        int result[] = new int[nums.length];
        int posIndex = 0;
        int negIndex = 0;
        int posresIndex = 0;
        int negresIndex = 0;

        for (int i = 0 ; i < nums.length ; i++)
        {
            if (nums[i] > 0)
            {
                positive[posIndex] = nums[i] ;
                posIndex++ ;
            }
            else 
            {
                negative[negIndex]=nums[i];
                negIndex ++ ;

            }
    }

    for (int i = 0; i < nums.length ; i ++)
    {
        if (i % 2 == 0)
         {
           result[i] = positive[posresIndex];
           posresIndex++ ;   
         }
          else 
          {
           result[i] = negative[negresIndex]; 
           negresIndex++ ; 
         }

    }
    return result;
} 
}