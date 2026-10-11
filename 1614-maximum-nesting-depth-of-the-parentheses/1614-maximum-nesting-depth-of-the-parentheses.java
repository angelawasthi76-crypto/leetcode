class Solution {
    public int maxDepth(String s) {
        int dep=0;
        int ans=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                dep++;
                ans=Math.max(ans,dep);
            }
            if(s.charAt(i)==')'){
                dep--;
            }
        }
        return ans;

    }
}