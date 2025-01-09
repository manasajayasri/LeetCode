class Solution {
    public int[] findArray(int[] pref) {
        int len = pref.length;
        int[] newArray = new int[len];
         newArray[0] = pref[0];

        for(int i=1; i<len ; i++){
            newArray[i] = pref[i-1] ^ pref[i];
        }
        return newArray;
    }
}