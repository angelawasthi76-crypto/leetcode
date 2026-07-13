class Solution {

    List<List<Integer>> ans = new ArrayList<>();

     private void backtrack( int target, int index,int k, List<Integer> curr,int cnt) {
        if (target == 0 && cnt ==k) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (cnt>k || target < 0) {
            return;
        }

        for (int i = index; i <=9; i++) {
            curr.add(i);
            backtrack( target - i, i+1,k, curr,cnt+1); // reuse same element
            curr.remove(curr.size() - 1); // backtrack
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(n,1,k,new ArrayList<>(),0);
        return ans;
    }
}