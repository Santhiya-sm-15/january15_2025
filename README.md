# january15_2025
The problem that i solved today in leetcode

1.Given two positive integers num1 and num2, find the positive integer x such that: x has the same number of set bits as num2, and The value x XOR num1 is minimal. Note that XOR is the bitwise XOR operation. Return the integer x. The test cases are generated such that x is uniquely determined. The number of set bits of an integer is the number of 1's in its binary representation.

Code:
class Solution {
    public int minimizeXor(int num1, int num2) {
        int res=0,target=Integer.bitCount(num2),set=0,cur=31;
        while(set<target)
        {
            if((num1 & (1<<cur))!=0 || target-set>cur)
            {
                res=res | (1<<cur);
                set++;
            }
            cur--;
        }
        return res;
    }
}
