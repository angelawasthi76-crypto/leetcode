class Solution {

    List<List<Integer>>ans= new ArrayList<>();

    public void combi(int n, int index , int k, List<Integer> res){
        if(res.size()==k){
            ans.add(new ArrayList<>(res));
            return;
        }

        for(int i=index;i<=n;i++){
            res.add(i);
            combi(n,i+1,k,res);
            res.remove(res.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        combi(n,1,k,new ArrayList<>());

        return ans;
    }
}