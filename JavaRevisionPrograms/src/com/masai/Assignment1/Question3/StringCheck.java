package com.masai.Assignment1.Question3;

public class StringCheck {

	public static void main(String[] args) {
		String s3 = "Value1";
		String s2 = "Value2";

		for (int i = 0; i < 100000; ++i) {
				s3 = s3 + s2;
		}

	}

}
