class Solution {
    public long sumAndMultiply(int n) {
        
        long num =0;
        long sum =0;
        int j=1;

        while(n>0){
            int digit =n%10;

            if(digit!=0){
                num=num+digit*j;
                sum+=digit;
                 j*=10;
            }
            n/=10;
           
        }
        return num*sum;
    }
}