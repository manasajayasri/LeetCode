class Solution {
    public int divide(int dividend, int divisor) {
               if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; 
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);

        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        long result = 0;
        long tempDivisor = absDivisor;
        long tempResult = 1;

        while (absDividend >= (tempDivisor << 1)) {
            tempDivisor <<= 1;
            tempResult <<= 1;
        }

        while (absDividend >= absDivisor) {
            if (absDividend >= tempDivisor) {
                absDividend -= tempDivisor;
                result += tempResult;
            }
            tempDivisor >>= 1;
            tempResult >>= 1;
        }

        return negative ? (int)-result : (int)result;
    }
}