class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
            int lucky = -1; // default if none found
            for (int key : map.keySet()) {
            if (map.get(key) == key) {
                lucky = Math.max(lucky, key); // choose the largest lucky integer
            }
        }
        return lucky;
    }
}