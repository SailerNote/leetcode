// Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
//
//
// Example 1:
//
//
// Input: a = 1, b = 2
// Output: 3
//
//
//
// Example 2:
//
//
// Input: a = -2, b = 3
// Output: 1
//
//
//
//


class Solution {
    public int getSumRecursive(int a, int b) {
        return b == 0 ? a:getSumRecursive(a^b, (a&b) << 1);
    }
    
    public int getSumIterative(int a, int b) {
        while (b != 0) {
            int sum = a ^ b;
            int carry = (a&b)<<1;
            a = sum;
            b = carry;
        }
        return a;
    }
    //9:1001 11:1011 9+11:10100 
    public int getSum(int a, int b) {
        return getSumRecursive(a, b);
    }
}
