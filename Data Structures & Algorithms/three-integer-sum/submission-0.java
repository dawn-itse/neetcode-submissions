
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // Bước 1: Sắp xếp mảng

        for (int i = 0; i < nums.length - 2; i++) {
            // Nếu số nhỏ nhất > 0 thì tổng không thể bằng 0
            if (nums[i] > 0) break;

            // Bỏ qua giá trị trùng lặp của nums[i]
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            // Bước 2: Two Pointers cho phần còn lại
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // Bỏ qua các phần tử trùng lặp
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }
}