class Solution {
    public int[] decode(int[] encoded, int first) {
        int len = encoded.length +1;
        int[] arr = new int[len];
        arr[0] = first;
        for(int i=1; i<len ; i++){
            arr[i] = encoded[i-1] ^ arr[i-1];
        }
        return arr;
    }
}
