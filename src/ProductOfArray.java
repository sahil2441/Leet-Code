

public class ProductOfArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int[] result = productExceptSelf(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] result = new int[nums.length];
		int leftProd = nums[0];
		result[0] = 1;

		for (int i = 1; i < nums.length; i++) {
			result[i] = leftProd;
			leftProd *= nums[i];
		}

		int rightProd = nums[nums.length - 1];
		for (int i = n - 2; i >= 0; i--) {
			result[i] *= rightProd;
			rightProd *= nums[i];

		}

		return result;

	}
}
