class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1); 
        }
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : map.keySet()) {
            int valueKey = map.get(key); 
            if (bucket[valueKey] == null) {
                bucket[valueKey] = new ArrayList<>();
            }
            bucket[valueKey].add(key);
        }
        int[] count = new int[k];
        int n = 0;
        for (int i = bucket.length - 1; i >= 0 && n < k; i--) { 
            if (bucket[i] != null) { 
                for (int num : bucket[i]) {
                    count[n] = num;
                    n++;
                    if (n == k) {
                        return count;
                    }
                }
            }
        }
        return count;
    }
}