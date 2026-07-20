class Solution {

    public int recur(int low, int high, int[]nums, int target){
        if(low >high){
            return -1;
        }

        int mid =(low+high)/2;

        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]>target){
           return recur(low,mid-1,nums,target);
        }
        else{
        return recur(mid+1,high,nums,target);
        }
    }

    public int search(int[] nums, int target) {
        return recur(0,nums.length-1,nums,target);
    }
}