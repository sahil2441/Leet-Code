/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find
 * the one that is missing from the array. For example, Given nums = [0, 1, 3]
 * return 2.
 * 
 * @author sahiljain
 *
 */
public class MissingNumber {
	public int missingNumber(int[] nums) {

		if (nums.length == 1)
			return nums[0] == 0 ? 1 : 0;

		else {
			int sumTotal = 0, i = 0, sumActual = 0;
			while (i < nums.length) {
				sumTotal += i;
				sumActual += nums[i];
				i++;
			}
			sumTotal += i;

			if (sumTotal == sumActual) {
				return 0;
			} else {
				return sumTotal - sumActual;
			}
		}

	}
}