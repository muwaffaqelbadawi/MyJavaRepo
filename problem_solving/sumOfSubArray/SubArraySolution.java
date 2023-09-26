class SubArraySolution {
    public int subArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k < j; k++) {
                    sum += arr[k];
                }
            }
        }
        return sum;
    }
}