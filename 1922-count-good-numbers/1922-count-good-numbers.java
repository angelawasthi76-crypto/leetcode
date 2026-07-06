class Solution {

       long mod =1000000007;

    public long pow(int x,long n){

        if(n==0)return 1;

        long half = pow(x,n/2);

        if(n%2==0){
            return (half*half)%mod;
        }
        else{
            return (x*half*half)%mod;
        }
    }

    public int countGoodNumbers(long n) {
        
     

        long even =(n+1)/2;
        long odd = n/2;

        long ans = ((pow(5,even))* (pow(4,odd))) % mod;

        return (int)ans;
    }
}