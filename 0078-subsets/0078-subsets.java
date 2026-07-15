class Solution {
    List<List<Integer>>ans = new ArrayList<>();

    public void backtrack(int[]nums, int index , List<Integer>curr){
        if(index== nums.length){
            ans.add(new ArrayList(curr));
            return;
        }
        curr.add( nums[index]);
        backtrack(nums, index+1,curr);
        curr.remove(curr.size()-1);
        backtrack(nums,index+1,curr);
    }

    public List<List<Integer>> subsets(int[] nums) {
        
        backtrack(nums, 0, new ArrayList<>());
        return ans;
    }
}