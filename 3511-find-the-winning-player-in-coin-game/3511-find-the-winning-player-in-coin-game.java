class Solution {
    public String winningPlayer(int x, int y) {
        if(Math.min(x, y/4) % 2 == 0) {
            return "Bob";
        }
        return "Alice";
    }
}