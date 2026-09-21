class Solution {
    public boolean isThree(int n) {
        int ctr = 2;
        for(int i=2; i<n; i++){
            if(n%i == 0)ctr++;
            if(ctr>3)break;
        }
        return ctr==3;
    }
}