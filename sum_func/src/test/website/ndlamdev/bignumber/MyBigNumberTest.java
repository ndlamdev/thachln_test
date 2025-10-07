package test.website.ndlamdev.bignumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import website.ndlamdev.bignumber.MyBigNumber;

import java.math.BigInteger;


public class MyBigNumberTest {

	@Test
	public void tesSum() {
		String a = "123123132132132133412436787124354657687651324354963625167345069723627384957508597687546351364735846987543236475869865435245367";
		String b = "11232753876573512661562313524162738387656172834637548637465136273876136247850978654634783596787367283878767283987657621728394";
		BigInteger bigA = new BigInteger(a);
		BigInteger bigB = new BigInteger(b);

		String resultMyBigNumber = MyBigNumber.sum(a, b);
		String resultBigNumber = bigA.add(bigB).toString();

		Assertions.assertEquals(resultMyBigNumber, resultBigNumber);
	}

	@Test
	public void testSumWithZero() {
		// Test cộng với số 0
		String a = "123456789";
		String b = "0";
		BigInteger bigA = new BigInteger(a);
		BigInteger bigB = new BigInteger(b);

		String resultMyBigNumber = MyBigNumber.sum(a, b);
		String resultBigNumber = bigA.add(bigB).toString();

		Assertions.assertEquals(resultBigNumber, resultMyBigNumber);
	}

	@Test
	public void testSumBothZero() {
		// Test cộng 0 + 0
		String a = "0";
		String b = "0";
		BigInteger bigA = new BigInteger(a);
		BigInteger bigB = new BigInteger(b);

		String resultMyBigNumber = MyBigNumber.sum(a, b);
		String resultBigNumber = bigA.add(bigB).toString();

		Assertions.assertEquals(resultBigNumber, resultMyBigNumber);
	}

	@Test
	public void testSumWithCarryOver() {
		// Test với nhiều số nhớ (toàn số 9)
		String a = "9999999999999999999999999999";
		String b = "1";
		BigInteger bigA = new BigInteger(a);
		BigInteger bigB = new BigInteger(b);

		String resultMyBigNumber = MyBigNumber.sum(a, b);
		String resultBigNumber = bigA.add(bigB).toString();

		Assertions.assertEquals(resultBigNumber, resultMyBigNumber);
	}

	@Test
	public void testSumDifferentLength() {
		String a = "123456789123456789123456789";
		String b = "1";
		BigInteger bigA = new BigInteger(a);
		BigInteger bigB = new BigInteger(b);

		String resultMyBigNumber = MyBigNumber.sum(a, b);
		String resultBigNumber = bigA.add(bigB).toString();

		Assertions.assertEquals(resultBigNumber, resultMyBigNumber);
	}

	@Test
	public void testSumSameNumbers() {
		String a = "987654321987654321";
		String b = "987654321987654321";
		BigInteger bigA = new BigInteger(a);
		BigInteger bigB = new BigInteger(b);

		String resultMyBigNumber = MyBigNumber.sum(a, b);
		String resultBigNumber = bigA.add(bigB).toString();

		Assertions.assertEquals(resultBigNumber, resultMyBigNumber);
	}

	@Test
	public void testSumSmallNumbers() {
		String a = "5";
		String b = "7";
		BigInteger bigA = new BigInteger(a);
		BigInteger bigB = new BigInteger(b);

		String resultMyBigNumber = MyBigNumber.sum(a, b);
		String resultBigNumber = bigA.add(bigB).toString();

		Assertions.assertEquals(resultBigNumber, resultMyBigNumber);
	}

	@Test
	public void testSumWithLeadingZeros() {
		String a = "000123";
		String b = "000456";
		BigInteger bigA = new BigInteger(a);
		BigInteger bigB = new BigInteger(b);

		String resultMyBigNumber = MyBigNumber.sum(a, b);
		String resultBigNumber = bigA.add(bigB).toString();

		Assertions.assertEquals(resultBigNumber, resultMyBigNumber);
	}

	@Test
	public void testSumAllNines() {
		String a = "999999999";
		String b = "999999999";
		BigInteger bigA = new BigInteger(a);
		BigInteger bigB = new BigInteger(b);

		String resultMyBigNumber = MyBigNumber.sum(a, b);
		String resultBigNumber = bigA.add(bigB).toString();

		Assertions.assertEquals(resultBigNumber, resultMyBigNumber);
	}

	@Test
	public void testSumAlternatingDigits() {
		String a = "1234567890123456789";
		String b = "9876543210987654321";
		BigInteger bigA = new BigInteger(a);
		BigInteger bigB = new BigInteger(b);

		String resultMyBigNumber = MyBigNumber.sum(a, b);
		String resultBigNumber = bigA.add(bigB).toString();

		Assertions.assertEquals(resultBigNumber, resultMyBigNumber);
	}

	@Test
	public void testSumRepeatingDigits() {
		String a = "111111111111111111";
		String b = "222222222222222222";
		BigInteger bigA = new BigInteger(a);
		BigInteger bigB = new BigInteger(b);

		String resultMyBigNumber = MyBigNumber.sum(a, b);
		String resultBigNumber = bigA.add(bigB).toString();

		Assertions.assertEquals(resultBigNumber, resultMyBigNumber);
	}

	@Test
	public void testSumPowerOfTen() {
		String a = "1000000000000000000";
		String b = "1000000000000000000";
		BigInteger bigA = new BigInteger(a);
		BigInteger bigB = new BigInteger(b);

		String resultMyBigNumber = MyBigNumber.sum(a, b);
		String resultBigNumber = bigA.add(bigB).toString();

		Assertions.assertEquals(resultBigNumber, resultMyBigNumber);
	}

	@Test
	public void testSumMaxCarry() {
		String a = "555555555555555555";
		String b = "555555555555555555";
		BigInteger bigA = new BigInteger(a);
		BigInteger bigB = new BigInteger(b);

		String resultMyBigNumber = MyBigNumber.sum(a, b);
		String resultBigNumber = bigA.add(bigB).toString();

		Assertions.assertEquals(resultBigNumber, resultMyBigNumber);
	}
}