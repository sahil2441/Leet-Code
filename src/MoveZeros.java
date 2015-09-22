
public class MoveZeros {

	public static void main(String[] args) {
		int[] arr = { 0, 0, 1 };
		moveZeroes(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void moveZeroes(int[] nums) {

		int zeroPosition = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[zeroPosition++] = nums[i];
			}
		}
		while (zeroPosition < nums.length) {
			nums[zeroPosition++] = 0;
		}
	}

}
