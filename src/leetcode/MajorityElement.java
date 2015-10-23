package leetcode;

/**
 * Moore's Voting Algorithms Given an array of size n, find the majority
 * element. The majority element is the element that appears more than ⌊ n/2 ⌋
 * times.
 * 
 * You may assume that the array is non-empty and the majority element always
 * exist in the arra
 * 
 * @author sahiljain
 *
 */

public class MajorityElement {
	public int majorityElement(int[] nums) {
		if (nums.length < 2) {
			return nums[0];
		}
		int maj_elt = nums[0];
		int count = 1;

		// pick a candidate for maj_elt
		// it may not be a maj elt
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == maj_elt) {
				count++;
			} else {
				count--;
				if (count == 0) {
					maj_elt = nums[i];
					count++;
				}
			}
		}
		// count the occurances of maj_elt
		count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (maj_elt == nums[i]) {
				count++;
			}
		}
		if (count > nums.length / 2) {
			return maj_elt;
		}

		return -1;
	}
}
