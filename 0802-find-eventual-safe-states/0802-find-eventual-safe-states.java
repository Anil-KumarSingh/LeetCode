class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
      ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[n];
        for(int i =0; i<n; i++){
        for(int e : graph[i]){
            adj.get(e).add(i);
            indegree[i]++;
           }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0) q.add(i);
        }
       ArrayList<Integer> ans = new ArrayList<>();
       while(q.size()>0){
        int vertex = q.remove();
        ans.add(vertex);
        for(int ele: adj.get(vertex)){
            indegree[ele]--;
            if(indegree[ele]==0) q.add(ele);
        }
       }
        Collections.sort(ans);
        return ans;
      
    }
}
  