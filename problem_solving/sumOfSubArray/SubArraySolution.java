class SubArraySolution {
    int len = 0;
    int sum = 0;

    
    public int subArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                // Brute force in the best case
                // Time complexity = O(N^2)
                sum += arr[j];

                    if (sum == j) {
                        len = Math.max(len, j - i + 1);
                    }

                /* for (int k = i; k < j; k++) {
                    // Time complexity O(N^3)
                    sum += arr[k];

                    if (sum == k) {
                        len = Math.max(len, j - i + 1);
                    }
                } */
            }
        }
        return sum;
    }
}