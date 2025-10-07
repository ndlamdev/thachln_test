package website.ndlamdev.bignumber;

import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Nguyen Dinh Lam
 * Email: kiminonawa1305@gmail.com
 * Phone number: +84 855354919
 * Create at: 6:32 PM-07/10/2025
 *  User: kimin
 **/

public class MyBigNumber {
	private static final Logger LOGGING = Logger.getLogger("website.ndlamdev.bignumber.MyBigNumber");

	public static String sum(String stn1, String stn2) {
		if ("0".equals(stn1)) return stn2;
		if ("0".equals(stn2)) return stn1;

		StringBuilder builder = new StringBuilder();
		int stn1Length = stn1.length();
		int stn2Length = stn2.length();
		int temp = 0;
		for (int i = 0; i < Math.max(stn1Length, stn2Length); i++) {
			int index1 = stn1Length - i - 1;
			int index2 = stn2Length - i - 1;
			int num1 = 0;
			int num2 = 0;

			if (index1 >= 0) num1 = stn1.charAt(index1) - '0';
			if (index2 >= 0) num2 = stn2.charAt(index2) - '0';

			int total = num1 + num2 + temp;
			builder.append(total % 10);
			temp = total / 10;
		}
		if (temp > 0) builder.append(temp);
		String result = formatResult(builder);
		LOGGING.log(Level.INFO, result);
		return result;
	}

	private static String formatResult(StringBuilder builder) {
		int countStartWithZero = 0;
		for (int i = builder.length() - 1; i >= 0; i--) {
			if (builder.charAt(i) == '0') countStartWithZero++;
			else break;
		}

		return builder.reverse().substring(countStartWithZero);
	}

	public static void main(String[] args) {
		var a = args[0];
		var b = args[1];
		var bigA = new BigInteger(a);
		var bigB = new BigInteger(b);
		var start = System.currentTimeMillis();
		String resultMyBigNumber = MyBigNumber.sum(a, b);
		var end = System.currentTimeMillis();
		System.out.println("MyBigNumber: " + resultMyBigNumber);
		System.out.println("Time process:  " + (end - start) / 1000 + " ms");
		start = System.currentTimeMillis();
		String resultBigNumber = bigA.add(bigB).toString();
		end = System.currentTimeMillis();
		System.out.println("BigNumber: " + resultBigNumber);
		System.out.println("Time process:  " + (end - start) / 1000 + " ms");
	}
}
