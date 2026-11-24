class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []copy =nums.clone();
        Arrays.sort(copy);

        int i=0;
        int j=copy.length-1;

        while(j>=0 && i<=nums.length-1){
            if(copy[i]+copy[j]==target){
                break;
            }
            else if(copy[i]+copy[j]>target){
                j--;
            }
            else{
                i++;
            }
        }

        int num1 =copy[i];
        int num2 =copy[j];
        int ans1=-1;
        int ans2=-1;

        for(int k=0;k<nums.length;k++){
            if(nums[k]==num1 && ans1==-1){
                ans1=k;
            }
            else if(nums[k]==num2 ){
                ans2=k;
            }
        }
        return new int[]{ans1,ans2};        
    }
}