package leetcode;

public class SoluationRemoveElement {

	public int removeElement(int[] nums, int val) {

		// 1 2 3 4 5 6 7
		//
		if (nums.length == 0) {
			return 0;
		}
		int count = 0;
		int repeatCount = 0;
		for (int i = 0; i < nums.length - repeatCount; i++) {
			if (val != nums[i]) {
				count++;

			} else {
				int tmp = nums[i];
				nums[i] = nums[nums.length - 1 - repeatCount];
				nums[nums.length - 1 - repeatCount] = tmp;
				i--;
				repeatCount++;
			}

		}

		return count;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 7, 5, 5, 5, 5 };
		int count = new SoluationRemoveElement().removeElement(nums, 7);
		System.err.println(count);

		for (int i = 0; i < count; i++) {
			System.err.println(nums[i]);
		}
	}
}
