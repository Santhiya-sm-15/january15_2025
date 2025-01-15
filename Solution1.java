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