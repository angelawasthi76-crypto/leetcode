class Solution {
    public int smallestEvenMultiple(int n) {
        int i=1;
        int ans;
        while(true){
            if((n*i)%2==0){
                ans=n*i;
                break;
            }
            i++;
        }
        return ans;
    }
}