import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicateII {

	public static void main(String[] args) {
		Set set = new HashSet();
		System.out.println(set.add(1));
		System.out.println(set.add(1));

	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {

		Map map = new HashMap();

		for (Integer i = 0; i < nums.length; i++) {

			if (map.get(nums[i]) != null) {

				Integer x = (Integer) map.get(nums[i]);
				if (i - x <= k) {
					return true;
				}
			}
			map.put(nums[i], i);
		}
		return false;
	}
}
