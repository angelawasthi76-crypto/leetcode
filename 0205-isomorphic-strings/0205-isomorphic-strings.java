class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> stot=new HashMap<>();
        Map<Character,Character> ttos=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char s1 =s.charAt(i);
            char t1 =t.charAt(i);

            if(stot.containsKey(s1) && stot.get(s1)!=t1){
                return false;
            }
             stot.put(s1,t1);
            if(ttos.containsKey(t1) && ttos.get(t1)!=s1){
                return false;
            }
           
            ttos.put(t1,s1);
        }
        return true;
    }
}