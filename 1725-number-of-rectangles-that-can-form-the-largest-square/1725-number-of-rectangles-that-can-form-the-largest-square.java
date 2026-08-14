class Solution {
    public int countGoodRectangles(int[][] rectangles)
    {
        int n = rectangles.length ;
        int largest = 0;
        int[] minArray = new int[rectangles.length];
        for ( int i = 0 ; i <= n-1 ; i++)
        {
           int minimum = Math.min(rectangles[i][0], rectangles[i][1]);
           minArray[i] = minimum ;
        }
        for (int j = 0 ; j <= n-1 ; j++)
        {
            
            if ( minArray[j] > largest)
            {
                largest = minArray[j];
            }
        }
        int count = 0;

      for (int i = 0; i < minArray.length; i++)
        {
           if (minArray[i] == largest)
              {
        count++;
              }
        }
        return count ;
    }
}