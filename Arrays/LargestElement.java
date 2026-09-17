class Solution {
    public static int largest(int[] arr) {
        int l = arr[0];

        for (int i = 0; i < arr.length; i++) {
            l = Math.max(l, arr[i]);
        }

        return l;
    }
}
