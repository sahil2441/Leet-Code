public class Robber {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 1, 3, 100 };
		// System.out.println(rob(arr));
	}

	public static int rob(int[] nums) {

		if (nums == null || nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		if (nums.length == 2)
			return Math.max(nums[0], nums[1]);
		return Math.max(robHelper(nums, 0, nums.length - 2), robHelper(nums, 1, nums.length - 1));
	}

	public static int robHelper(int[] nums, int left, int right) {

		if (right - left == 1)
			return Math.max(nums[left], nums[right]);

		int twoStepBack = nums[left];
		int oneStepBack = Math.max(nums[left], nums[left + 1]);

		int current = -1;

		for (int i = left + 2; i <= right; i++) {

			current = Math.max(twoStepBack + nums[i], oneStepBack);
			twoStepBack = oneStepBack;
			oneStepBack = current;
		}
		return current;
	}
}