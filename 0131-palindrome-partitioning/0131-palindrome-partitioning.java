class Solution {
   
   List<List<String>> ans = new ArrayList<>();

    public boolean isPal(int left, int right,String s){
        if(left>=right){
            return true;
        }
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        return isPal(left+1,right-1,s);
    }

    public void recur(int index,String s, List<String>curr){

        if(index == s.length()){
            ans.add(new ArrayList(curr));
        }
        

        for(int end =index ;end<=s.length()-1;end++){
            if(isPal(index,end,s)){
                curr.add(s.substring(index,end+1));
                recur(end+1,s,curr);
                curr.remove(curr.size()-1);

            }
            

        }
    }

    public List<List<String>> partition(String s)  {
       
       recur(0,s,new ArrayList<>());
       return ans;
    }
}
    
   