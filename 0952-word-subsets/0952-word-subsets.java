class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {

 HashMap<Character, Integer> maxFreqMap = new HashMap<>();
        for (String b : words2) {
            HashMap<Character, Integer> freqMap = new HashMap<>();
            for (char c : b.toCharArray()) {
                int count = freqMap.getOrDefault(c, 0) + 1;
                freqMap.put(c, count);
                if (count > maxFreqMap.getOrDefault(c, 0)) {
                    maxFreqMap.put(c, count);
                }
            }
        }

        List<String> result = new ArrayList<>();
        words1Loop:
        for (String a : words1) {
            HashMap<Character, Integer> freqMap = new HashMap<>();
            for (char c : a.toCharArray()) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }

            for (Character key : maxFreqMap.keySet()) {
                if (freqMap.getOrDefault(key, 0) < maxFreqMap.get(key)) {
                    continue words1Loop; 
                }
            }
            result.add(a);  
        }

        return result;
    }
}
