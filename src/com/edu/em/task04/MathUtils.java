package com.edu.em.task04;

public class MathUtils {

	static class Factorial {

		static int calculation(int number) {
			
			int res = 1;
			
			for (int i = number; i > 0; i--) {
				res = res * i;
			}

			return res;
		}
	}
}