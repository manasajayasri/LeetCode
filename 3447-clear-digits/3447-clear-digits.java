class Solution {
    public String clearDigits(String s) {
 StringBuilder result = new StringBuilder(s);

        while (true) {
            boolean foundDigit = false;

            for (int i = 0; i < result.length(); i++) {
                if (Character.isDigit(result.charAt(i))) {
                    foundDigit = true;

                    for (int j = i - 1; j >= 0; j--) {
                        if (!Character.isDigit(result.charAt(j))) {
                            result.deleteCharAt(j); 
                            break;
                        }
                    }

                    result.deleteCharAt(i - 1 >= 0 ? i - 1 : i);
                    break; 
                }
            }

            if (!foundDigit) {
                break;
            }
        }

        return result.toString();
    }
}