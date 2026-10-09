class Solution
 {
    public int[] getConcatenation(int[] nums) 
    {
        int n = nums.length + nums.length ;
       int newarr[] = new int [n];
       int i  ;
       for ( i = 0 ; i < nums.length ; i++)
       {
           newarr[i] = nums[i];
       }
       for(int  j = nums.length-1  ; j  >= 0 ; j--)
       {
        newarr[nums.length + j] = nums[j];
       }
        return newarr ;
    }
}