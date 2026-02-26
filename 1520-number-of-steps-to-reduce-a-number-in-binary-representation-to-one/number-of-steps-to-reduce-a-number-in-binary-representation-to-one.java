class Solution {
    public int numSteps(String s) {
        int steps = 0;
        int carry = 0;
        
        // Start from right (LSB) and move left
        for (int i = s.length() - 1; i > 0; i--) {
            
            int bit = (s.charAt(i) - '0') + carry;
            
            if (bit % 2 == 0) {
                // even → divide by 2
                steps += 1;
            } else {
                // odd → add 1 then divide
                steps += 2;
                carry = 1;
            }
        }
        
        return steps + carry;
    }
}