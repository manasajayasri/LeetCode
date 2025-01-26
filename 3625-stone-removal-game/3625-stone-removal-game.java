class Solution {
    public boolean canAliceWin(int n) {        
        int rem = 10;  
        while (n >= rem) { 
            n -= rem; 
            rem--;     
            if (rem == 0) break; 
        }

        return rem % 2 == 1;
    }
}