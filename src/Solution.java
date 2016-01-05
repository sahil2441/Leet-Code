import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		int[] nums = { 1 };
		System.out.println(combinationSum(nums, 1));

	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList();
		if (target == 0)
			return list;
		List<Integer> currentList = new ArrayList();
		Arrays.sort(candidates);
		combination(candidates, 0, target, list, currentList);
		return list;
	}

	public static void combination(int[] candidates, int start, int target, List<List<Integer>> list,
			List<Integer> currentList) {
		if (target == 0) {
			list.add(currentList);
			return;
		} else if (target > 0) {
			for (int i = start; i < candidates.length; i++) {
				currentList.add(candidates[i]);
				combination(candidates, start, target - candidates[i], list, currentList);
				currentList.remove(currentList.size() - 1);
			}
		}

	}

	public static int maxProduct(String[] words) {
		int max = 0;
		int[] bytes = new int[words.length];
		for (int i = 0; i < words.length; i++) {
			int val = 0;
			for (int j = 0; j < words[i].length(); j++) {
				val |= 1 << (words[i].charAt(j) - 'a');
			}
			bytes[i] = val;
		}
		for (int i = 0; i < bytes.length; i++) {
			for (int j = i + 1; j < bytes.length; j++) {
				if ((bytes[i] & bytes[j]) == 0)
					max = Math.max(max, words[i].length() * words[j].length());
			}
		}
		return max;
	}

	public static List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> answer = new ArrayList();

		if (nums.length < 1)
			return answer;

		List<Integer> dummy = new ArrayList();
		dummy.add(nums[0]);
		answer.add(dummy);

		int index = 1;

		while (index < nums.length) {
			int num = nums[index];

			List<List<Integer>> newAnswer = new ArrayList();
			for (int i = 0; i < answer.size(); i++) {
				for (int j = 0; j < answer.get(0).size() + 1; j++) {
					List<Integer> temp = new ArrayList<>(answer.get(i));
					temp.add(j, num);
					newAnswer.add(temp);
				}
			}
			index++;
			answer = newAnswer;
		}

		return answer;
	}

	public static void sortColors(int[] nums) {

		if (nums == null || nums.length < 2)
			return;
		int n = nums.length;
		int i = 0, j = n - 1;
		while (i < j) {
			if (nums[i] == 0)
				i++;
			else if (nums[j] != 0)
				j--;
			else if (nums[i] != 0 && nums[j] == 0) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
				j--;
			} else {
				i++;
				j--;
			}
		}

		j = n - 1;
		while (i < j) {
			if (nums[i] == 1)
				i++;
			else if (nums[j] != 1)
				j--;
			else if (nums[i] != 1 && nums[j] == 1) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
				j--;
			} else {
				i++;
				j--;
			}
		}

	}
}