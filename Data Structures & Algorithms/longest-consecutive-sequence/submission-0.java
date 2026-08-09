class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0 || nums == null) {
            return 0;
        }
        Set<Integer> nSet = new HashSet<>();
        for (int num : nums) {
            nSet.add(num);
        }
        int maxLength = 0;
        for (int num : nums) {
            if (!nSet.contains(num - 1)) {
                int currNum = num;
                int currSteak = 1;
                while (nSet.contains(currNum + 1)) {
                    currNum += 1;
                    currSteak += 1;
                }
                maxLength = Math.max(maxLength, currSteak);
            }
        }
        return maxLength;
    }
}
