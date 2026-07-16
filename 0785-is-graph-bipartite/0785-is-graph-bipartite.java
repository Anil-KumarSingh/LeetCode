class Solution {
    public boolean isBipartite(int[][] graph) {
        int len = graph.length;
        int[] colors = new int[len];
        for(int i = 0; i<len; i++){
            if(colors[i]!=0) continue;
            Queue<Integer> q = new LinkedList<>();
            q.offer(i);
            colors[i] =1;
            while(q.size()>0){
                int curr = q.poll();
                for(int next: graph[curr]){
                    if(colors[next] == 0){
                        colors[next] = -colors[curr];
                        q.offer(next);
                    }
                    else if(colors[next] != -colors[curr]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}