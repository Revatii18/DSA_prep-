class Solution {
    public int addedInteger(int[] nums1, int[] nums2)
   {
   int lowest1 = Integer.MAX_VALUE;
   int lowest2 = Integer.MAX_VALUE;
    for ( int i = 0 ; i < nums1.length ; i++)
    {
       if ( lowest1 > nums1[i] )
       {
         lowest1 = nums1[i];
       }
    }
     for ( int i = 0 ; i < nums2.length ; i++)
    {
       if ( lowest2 > nums2[i] )
       {
         lowest2 = nums2[i];
       }
    }
    int x = lowest2 - lowest1 ;
    return x ;
        
    }
}