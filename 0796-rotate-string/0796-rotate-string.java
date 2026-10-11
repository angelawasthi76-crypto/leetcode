class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder s1 = new StringBuilder(s);

        for(int i=0;i<s.length();i++){
            char c = s1.charAt(0);
            s1.deleteCharAt(0);
            s1.append(c);

            if (s1.toString().equals(goal))return true;
        }
        return false;
    }
}