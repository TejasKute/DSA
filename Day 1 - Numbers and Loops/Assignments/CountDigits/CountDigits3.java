
// Information
/*
Quick Summary
Data Type	Maximum Digits Approx
byte				3
short				5
int					10
long				19
BigInteger		Unlimited
String			Unlimited

For DSA/interviews:

If the input fits in normal numeric ranges → use int or long.
If the problem says "very large number" (100+ digits) → use String or BigInteger.

For your current input (720130930293892013892), long is not large enough, so use String or BigInteger.
*/

import java.math.BigInteger;
import java.util.Scanner;

public class MyClass {

    public static int countDigit(BigInteger n) {

        int count = 0;

        while (n.compareTo(BigInteger.ZERO) > 0) {
            count++;
            n = n.divide(BigInteger.TEN);
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        BigInteger number = sc.nextBigInteger();

        System.out.println("Total Count of Digit: " + countDigit(number));

        sc.close();
    }
}