import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {

		if (nums.length <= 1) {
			return false;
		}

		Map<Integer, Boolean> map = new HashMap();
		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) == null) {
				map.put(nums[i], true);
			} else {
				return true;
			}
		}
		return false;

	}
}