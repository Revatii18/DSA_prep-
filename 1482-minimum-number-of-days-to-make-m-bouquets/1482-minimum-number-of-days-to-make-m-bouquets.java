import java.util.Arrays;

class Solution 
{
    public int minDays(int[] bloomDay, int m, int k) 
    {

        long totalFlowers = (long) m * k;

     if (totalFlowers > bloomDay.length)
   {
       return -1;
    }
        int low = bloomDay[0];
      int high = bloomDay[0];

   for (int i = 1; i < bloomDay.length; i++)
{
    low = Math.min(low, bloomDay[i]);
    high = Math.max(high, bloomDay[i]);
}

       // int low = min ;
        //int high = max ;
        while (low <= high)
        {
            int mid = low + (high - low ) / 2 ;
            if(isPossible (bloomDay, mid, m, k))
            {
                high = mid - 1 ;
            }
            else low = mid+ 1 ;
        }
        return low ;
    }
    boolean isPossible(int[] bloomDay, int day, int m, int k)
{
    int count = 0;
    int bouquets = 0;

    for (int bloom : bloomDay)
    {
        if (bloom <= day)
        {
            count++;

            if (count == k)
            {
                bouquets++;
                  if (bouquets == m)
         {
             return true;
         }
                count = 0;
            }
        }
        else
        {
            count = 0;
        }
    }

    return bouquets >= m;
}
}
    
