class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        
        int cnt=0;  
        
        for( int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c=='('){
                if(cnt!=0){
                    ans.append("(");
                }
                cnt++;
            }
            if(c==')'){
                cnt--;
                if(cnt!=0){
                    ans.append(')');
                }
            }
        }
            return ans.toString();
        }
    
}