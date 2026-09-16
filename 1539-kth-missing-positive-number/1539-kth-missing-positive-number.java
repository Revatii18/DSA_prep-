import java.util.*;

class Solution
{
    public int findKthPositive(int[] arr, int k)
    {
        List<Integer> list = new ArrayList<>();

        for (int number = 1; ; number++)
        {
            boolean found = false;

            for (int j = 0; j < arr.length; j++)
            {
                if (arr[j] == number)
                {
                    found = true;
                    break;
                }
            }

            if (!found)
            {
                list.add(number);
            }

            if (list.size() == k)
            {
                return list.get(k - 1);
            }
        }
    }
}