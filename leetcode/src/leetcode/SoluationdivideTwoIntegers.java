package leetcode;

public class SoluationdivideTwoIntegers {

	public int divide(int dividend, int divisor) {
		int result = 0;
		boolean positive = true;
		if (Integer.MIN_VALUE == dividend) {
			if (divisor == Integer.MIN_VALUE) {
				return 1;
			}

			if (divisor == 1) {
				return Integer.MIN_VALUE;
			}
			if (divisor == -1) {
				return Integer.MAX_VALUE;
			}

			if (divisor < 0) {
				positive = false;
				divisor = Math.abs(divisor);
			}

			while (dividend < -divisor) {
				dividend += divisor;
				result += 1;
			}
			return positive ? result : -result;
		}
		
		
		
		
		/**
		 * 根据被除数，分析需要移位多少
		 */
//		public int findMoveCount(int divisor) {
//			for()
//			
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		

		if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) {

		} else {
			positive = false;
		}
		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);
		while (dividend >= divisor) {
			dividend -= divisor;
			result += 1;
		}
		return positive ? result : -result;
	}

	public static void main(String[] args) {

		int d = new SoluationdivideTwoIntegers().divide(-2147483648, 2);
		System.err.println(d);
	}
}
