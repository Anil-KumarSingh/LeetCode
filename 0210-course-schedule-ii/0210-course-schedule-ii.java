class Solution {
    public int[] findOrder(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[n];
        for(int[] e : edges){
            int u = e[1], v = e[0];
            adj.get(u).add(v);
            indegree[v]++;
        }

        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0) q.add(i);
        }
        while(q.size()>0){
            int vertex = q.remove();
            ans.add(vertex);
            for(int ele: adj.get(vertex)){
                indegree[ele]--;
                if(indegree[ele]==0) q.add(ele);
            }
        }

        int[] ans2 = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            ans2[i] = ans.get(i);
        }

        if(ans.size()!=n) return new int[0];
         return ans2;
    }
}
