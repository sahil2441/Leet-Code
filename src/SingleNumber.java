
public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 2 };
		System.out.println(singleNumber(nums));
	}

	public static int[] singleNumber(int[] nums) {
		if (nums.length == 0)
			return null;
		int diff = 0, sum = 0;
		int result1 = 0;
		for (int i = 0; i < nums.length; i++) {
			result1 ^= nums[i];
		}

		for (int i = 0; i < nums.length; i++) {
			nums[i] *= nums[i];
		}
		int result2 = 0;
		for (int i = 0; i < nums.length; i++) {
			result2 ^= nums[i];
		}

		result2 /= result1;
		if (result2 > result1) {
			sum = result2;
			diff = result1;
		} else {
			sum = result1;
			diff = result2;
		}

		int a, b;
		a = (sum + diff) / 2;
		b = sum - a;

		int[] arr = { a, b };
		return arr;
	}
}
