public class HouseRobber {
	public int rob(int[] nums) {
		if (nums.length == 0)
			return 0;

		if (nums.length <= 2) {
			return nums.length == 2 ? Math.max(nums[0], nums[1]) : nums[0];
		}

		int two_step_back = nums[0];
		int one_step_back = Math.max(nums[0], nums[1]);
		int current = -1;

		for (int i = 2; i < nums.length; i++) {
			current = Math.max(one_step_back, nums[i] + two_step_back);
			two_step_back = one_step_back;
			one_step_back = current;
		}
		return current;

	}
}