class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List<List<Integer>> ans = new ArrayList<>();
         Arrays.sort(candidates);
        backtrack(candidates,target,0, new ArrayList<>(), ans);
        return ans;
    }
    public void backtrack(int[] candidates, int target, int st, List<Integer> curr, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(target<0) return;

        for(int i=st; i<candidates.length; i++){
            if (i > st && candidates[i] == candidates[i - 1]) continue;
           curr.add(candidates[i]);
          
           backtrack(candidates,target-candidates[i],i+1, curr , ans);
           curr.remove(curr.size()-1);
        }
    }
}