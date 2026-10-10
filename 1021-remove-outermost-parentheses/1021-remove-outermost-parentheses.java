class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        
        int cnt=0;  
        
        for( int i=0;i<s.length();i++){

            if(s.charAt(i)=='('){
                if(cnt!=0){
                    ans.append("(");
                }
                cnt++;
            }
            if(s.charAt(i)==')'){
                cnt--;
                if(cnt!=0){
                    ans.append(')');
                }
            }
        }
            return ans.toString();
        }
    
}