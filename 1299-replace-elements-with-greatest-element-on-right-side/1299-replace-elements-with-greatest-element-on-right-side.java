class Solution
{
    public int[] replaceElements(int[] arr) 
    {
        int n = arr.length ; 
         int  greatest = 0 ;
        int [] result = new int[n];
        
        for ( int i = 0 ; i <= n -1 ; i++)
        {
            if ( i == n-1 )
            {
                result[i] = -1 ;
            }
           else 
           {
              greatest = arr[i+1];
           
            for ( int j = i + 1 ; j <= n-1 ; j ++ )
            {
                if  (arr[j] > greatest)
                {
                    greatest = arr[j];
                }
                result[i] = greatest ;
            } 
            

        } }
        return result ;
    }
}