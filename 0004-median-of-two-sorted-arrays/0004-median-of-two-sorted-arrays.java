class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int[] finall = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++)
        {
            finall[i] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++)
        {
            finall[nums1.length + i] = nums2[i];
        }

        Arrays.sort(finall);

        int n = finall.length;
        double median;

        if (n % 2 != 0)
        {
            median = finall[n / 2];
        }
        else
        {
            median = (finall[n / 2 - 1] + finall[n / 2]) / 2.0;
        }

        return median;
    }
}