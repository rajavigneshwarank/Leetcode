class Solution {
    public int maximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        int[] lastIndex = new int[10];
        
        // Record the last index of each digit
        for (int i = 0; i < digits.length; i++) {
            lastIndex[digits[i] - '0'] = i;
        }

        for (int i = 0; i < digits.length; i++) {
            // Check for a larger digit to swap with
            for (int d = 9; d > digits[i] - '0'; d--) {
                if (lastIndex[d] > i) {
                    // Swap the digits
                    char temp = digits[i];
                    digits[i] = digits[lastIndex[d]];
                    digits[lastIndex[d]] = temp;
                    // Convert back to integer and return
                    return Integer.parseInt(new String(digits));
                }
            }
        }

        // No swap made, return original number
        return num;
    }
}
