class Solution {
    public int[] countBits(int n) {
        int[] ret = new int[n +1];

        for(int i = 0; i <= n; i++){
            ret[i] = hammingWeight(i);
        }

        return ret;
    }

    public int hammingWeight(int n) {
        int ret = 0;
        
        while(n != 0){
            ret++;
            n &= (n - 1);
        }
        
        return ret;
    }
}