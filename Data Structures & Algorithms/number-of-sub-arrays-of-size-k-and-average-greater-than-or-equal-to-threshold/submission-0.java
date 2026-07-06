class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int res = 0;
        int l = 0;
        double sum = 0.0;

        for (int r = 0; r < arr.length; r++) {
            int window = r - l + 1;
            sum += arr[r];

            if (window == k) {
                double calc = sum / k;

                if (calc >= threshold) {
                    res++;
                }

                sum -= arr[l];
                l++;
            }
        }
        return res;
    }
}