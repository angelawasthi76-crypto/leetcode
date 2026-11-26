class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int cnt=0;

        int i=0;
        while(i<nums.length){
            if(nums[i]==1){
                cnt++;
            }
            else{
                cnt=0;
            }

            ans=Math.max(ans,cnt);
            i++;
        }
        return ans;
    }
}