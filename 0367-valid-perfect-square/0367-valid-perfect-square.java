class Solution {
    public boolean isPerfectSquare(int num) 
    {
        boolean flag = false ;
        for (int i = 0; (long)i * i <= num; i++)
        {
            if  ( (i*i) == num )
            {
                flag = true ;
            }
        }
        return flag ;
    }
}