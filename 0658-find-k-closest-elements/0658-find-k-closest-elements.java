import java.util.*;

class Triplet implements Comparable<Triplet> {
    int ele;
    int dist;

    Triplet(int ele, int dist) {
        this.ele = ele;
        this.dist = dist;
    }

    @Override
    public int compareTo(Triplet other) {
        // Sort by distance, then by value
        if (this.dist == other.dist) {
            return this.ele - other.ele;
        }
        return this.dist - other.dist;
    }
}

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>();

        // Step 1: Build heap with distance from x
        for (int num : arr) {
            pq.add(new Triplet(num, Math.abs(num - x)));
        }

        // Step 2: Extract k closest
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ans.add(pq.poll().ele);
        }

        // Step 3: Sort result before returning
        Collections.sort(ans);
        return ans;
    }
}
