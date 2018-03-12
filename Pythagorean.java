/**
 * Pythagorean.java  09/04/14
 *
 * @author - Tunde Odulate
 * @author - Period 3 CMHS
 *
 * @author - I received help from ...
 *
 */
import java.lang.Math;
import java.util.Scanner;

public class Pythagorean
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);  //needed for user input

		double lega;  //First Leg value
		double legb;  //second leg value

		System.out.print("What is the length of the first leg? : ");  //first leg input
		lega = keyboard.nextDouble();

		System.out.print("What is the length of the second leg? : ");  //second leg input
		legb = keyboard.nextDouble();

		double legc = Math.pow(lega, 2) + Math.pow(legb, 2);  //Pythagorean Theorem formula
		double root = Math.sqrt(legc);  //Square roots legc

		System.out.println("Your first leg and second leg is : " + lega + " and " + legb);  //Tells user first and second legs
		System.out.println("Your hypotenuse is : " + root);  //Gives results



	}
}