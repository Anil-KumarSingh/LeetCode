class Solution {
    public boolean canFinish(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[n];
        for(int[] e : edges){
            int u = e[0], v = e[1];
            adj.get(u).add(v);
            indegree[v]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0) q.add(i);
        }

        int count = 0; 
        while(!q.isEmpty()){
            int vertex = q.remove();
            count++;
            for(int nei : adj.get(vertex)){
                indegree[nei]--;
                if(indegree[nei]==0) q.add(nei);
            }
        }

        return count == n; 
    }
}
