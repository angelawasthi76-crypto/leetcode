class Solution {

    int[] dp;

    public boolean isPal(int left, int right, String s){

        if(left >= right)
            return true;

        if(s.charAt(left) != s.charAt(right))
            return false;

        return isPal(left+1, right-1, s);
    }

    public int recur(int index, String s){

        if(index == s.length())
            return 0;

        if(dp[index] != -1)
            return dp[index];

        int minPartition = Integer.MAX_VALUE;

        for(int end = index; end < s.length(); end++){

            if(isPal(index, end, s)){

                int partition = 1 + recur(end+1, s);

                minPartition = Math.min(minPartition, partition);
            }
        }

        return dp[index] = minPartition;
    }

    public int minCut(String s) {

        dp = new int[s.length()];
        Arrays.fill(dp, -1);

        return recur(0, s) - 1;
    }
}