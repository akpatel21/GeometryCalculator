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
		
		System.out.println("\n\n Hello, " + name + ", welcome to the Geometry Calculator!");
		System.out.print("Press enter to continue...");
		keyboard.nextLine();

	}

}
