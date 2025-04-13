PROBLEM: Count Good Numbers
Statement:
      A digit string is good if the digits (0-indexed) at even indices are even and the digits at odd indices are prime (2, 3, 5, or 7).
For example, "2582" is good because the digits (2 and 8) at even positions are even and the digits (5 and 2) at odd positions are prime. 
However, "3245" is not good because 3 is at an even index but is not even.Given an integer n, return the total number of good digit strings of length n. 
Since the answer may be large, return it modulo 109 + 7.
A digit string is a string consisting of digits 0 through 9 that may contain leading zeros.
      
Solution:
      class cogood {
    static final int M = (int)1e9 + 7;

    private long findPower(long a, long b) {
        if (b == 0) {
            return 1;
        }

        long half = findPower(a, b / 2);
        long result = (half * half) % M;

        if (b % 2 == 1) {
            result = (result * a) % M;
        }

        return result;
    }

    public int countGoodNumbers(long n) {
        long oddPositions = (n + 1) / 2;
        long evenPositions = n / 2;

        long result = (findPower(5, oddPositions) * findPower(4, evenPositions)) % M;
        return (int) result;
    }
}
