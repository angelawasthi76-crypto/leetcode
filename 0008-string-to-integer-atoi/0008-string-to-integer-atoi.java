class Solution {

    public static boolean isDigit(char c){
        return c>='0' && c<='9';
    }
    public int helper(String s,long num,int i,int sign){

        if(i>=s.length() || !isDigit(s.charAt(i))){
            return (int)num*sign;
        }
        int digit = s.charAt(i) - '0';

        if (num > Integer.MAX_VALUE / 10 ||
   (num == Integer.MAX_VALUE / 10 &&
   ((sign == 1 && digit > 7) ||
    (sign == -1 && digit > 8)))) {

    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
}

num = num * 10 + digit;
        return helper(s,num,i+1,sign);
    }

    public int func(String s){
        int i=0;
        long num=0;
        int sign=1;

        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        if(i<s.length() && s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(i<s.length() && s.charAt(i)=='+'){
            i++;
        }

        return helper(s,num,i,sign);
    }

    public int myAtoi(String s) {
        return (int)func(s);
    }
}