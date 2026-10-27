class Solution {
    static final long MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        long evenResult = power(5, even);
        long oddResult = power(4, odd);

        long result = (evenResult * oddResult) % MOD;
        return (int) result;
    }

    public long power(long base, long exp) 
    {
        long result = 1;

    while (exp > 0) 
    {
      if (exp % 2 == 1) 
      {
        result = (result * base) % MOD;
      }

    base = (base * base) % MOD;
    exp = exp / 2;
    }
    return result;
}


    }
