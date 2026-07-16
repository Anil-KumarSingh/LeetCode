class Solution {
    public boolean canFinish(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[n];
        boolean[] visited = new boolean[n];
        for(int[] e : edges){
            int u = e[0], v = e[1];
            adj.get(u).add(v);
            indegree[v]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0) q.add(i);
            visited[i]=true;
        }
       ArrayList<Integer> ans = new ArrayList<>();
       while(q.size()>0){
        int vertex = q.remove();
        ans.add(vertex);
        for(int ele: adj.get(vertex)){
            indegree[ele]--;
            if(indegree[ele]==0) q.add(ele);
            visited[ele]=true;
        }
       }
      if(ans.size()==n) return true;
      else return false;
    }
}
