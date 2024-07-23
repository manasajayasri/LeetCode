class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];

        if (n == 1) {
            result[0] = 0;
            return result;
        }

        int index = 0;
        for (int i = 1; i <= n / 2; i++) {
            result[index++] = i;
            result[index++] = -i;
        }

        if (n % 2 != 0) {
            result[index] = 0;
        }

        return result;

    }
}