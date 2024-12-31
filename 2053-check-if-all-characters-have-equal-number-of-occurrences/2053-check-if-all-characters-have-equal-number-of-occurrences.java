class Solution {
    public boolean areOccurrencesEqual(String s) {

        HashMap<Character, Integer> occ = new HashMap<>();

        for (char c : s.toCharArray()) {
            occ.put(c, occ.getOrDefault(c, 0) + 1);
        }

        int freq = -1;
        for(int count : occ.values()){
            if(freq == -1){
                freq = count;
            } else if(count != freq){
                return false;
            }
        }
        return true;
    }
}