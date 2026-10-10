class Solution {
    public String rev(String s){
        String reverse ="";
        for(int i=s.length()-1;i>=0;i--){
            reverse=reverse +s.charAt(i);
        }
        return reverse;
    }
    public String reverseWords(String s) {
        String []words  =s.trim().split("\\s+");

        for(int i=0;i<words.length;i++){
           words[i] =rev(words[i]);
        } 
        return String.join(" ",words);
    }
}