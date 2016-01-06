import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Robber {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 1, 3, 100 };
		// System.out.println(rob(arr));
		int[] cand = { 1, 2 };
		int target = 4;
		System.out.println(combinationSum2(cand, target));
	}

	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

		Arrays.sort(candidates);
		List<List<Integer>> list = new ArrayList();
		if (target == 0)
			return list;

		List<Integer> currentList = new ArrayList();
		helper(candidates, 0, target, currentList, list);
		return list;
	}

	static void helper(int[] candidates, int index, int target, List<Integer> currentList, List<List<Integer>> list) {
		if (target == 0) {
			list.add(new ArrayList(currentList));
			return;
		}
		if (target < 0)
			return;
		for (int i = index; i < candidates.length; i++) {
			if (i > index && candidates[i] == candidates[i - 1])
				continue;
			currentList.add(currentList.size(), candidates[i]);
			helper(candidates, index + 1, target - candidates[i], currentList, list);
			currentList.remove(currentList.size() - 1);
		}

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