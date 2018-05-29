package leetcode;

public class SoluationImplementStrstr {
	public int strStr(String haystack, String needle) {
		if (needle == null || needle.trim().equals("")) {
			return 0;
		}

		return haystack.indexOf(needle);

	}

	public static void main(String[] args) {
		int index = new SoluationImplementStrstr().strStr("hello", "ll");
		System.err.println(index);
	}

}
