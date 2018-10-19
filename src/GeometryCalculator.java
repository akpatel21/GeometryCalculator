/**
 * 
 * @author Akul Patel
 * GeometryCalculator
 * 
 */
import java.util.Scanner;

public class GeometryCalculator 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter your name:  ");
		String name = keyboard.nextLine();
		System.out.println("\n\nHello, " + name + ", welcome to the Geometry Calculator!");
		System.out.print("Press enter to continue...");
		keyboard.nextLine();
		
		System.out.println("\n\n\nArea of a triangle: ");
		System.out.print("Please enter the length of the base: ");
		String baseStr = keyboard.nextLine();
		double base = Double.parseDouble(baseStr);
		System.out.print("Please enter the height: ");
		String heightStr = keyboard.nextLine();
		double height = Double.parseDouble(heightStr);
		System.out.print("Please enter the unit of measure: ");
		String unit = keyboard.nextLine();
		
		double area = 0.5 * base * height;
		System.out.print("The area is " + area + " " + unit + "^2");
		
		System.out.println("\n\n\nVolume of a rectangular prism: ");
		System.out.print("Please enter the height of the prism: ");
		String prsmHeightStr = keyboard.nextLine();
		double prsmHeight = Double.parseDouble(prsmHeightStr);
		System.out.print("Please enter the length of the prism: ");
		String prsmLengthtStr = keyboard.nextLine();
		double prsmLength = Double.parseDouble(prsmLengthtStr);
		System.out.print("Please enter the width of the prism: ");
		String prsmWidthStr = keyboard.nextLine();
		double prsmWidth = Double.parseDouble(prsmWidthStr);
		System.out.print("Please enter the unit of measure: ");
		String prsmUnit = keyboard.nextLine();
		
		double volume = prsmHeight * prsmLength * prsmWidth;
		System.out.print("The volume is " + volume + " " + prsmUnit + "^3");
		
	}

}
