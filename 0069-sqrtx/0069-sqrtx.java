//------------------------------------BruteForce Approach------------------------------------
//Approach : Do Math.sqrt(x) to find the answer
//Approach 2 : Do linear search from 1 to x and check if (i * i <= x) or not and accordingly return the answer. TC - O(n), SC - O(1)

//------------------------------------Optimised Approach------------------------------------
//Approach : Since we need to find the max possible int which needs to satisfy a given condition and answer range is monotonic or may be of type[T, T, T, F, F, F, F, F], so we can apply Binary Search on answer. TC - (logn), SC - O(1)

class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x;
        int low = 1;
        int high = x;
        int sqrt = -1;

        while(low <= high){
            int mid = low + (high - low)/2;
            //Why mid <= x / mid instead of mid * mid <= x? coz mid * mid can overflow int.
            //If x = Integer.MAX_VALUE, then larger intermediate values can overflow.
            //mid <= x / mid is mathematically equivalent to mid * mid <=x for positive mid and avoids multiplication overflow.

            // Use division to avoid integer overflow
            if(mid <= x / mid){
                sqrt = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return sqrt;
    }
}