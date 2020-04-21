import java.util.Scanner;

public class CalculatePerimeterArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double length;
		double width;
		double area;
		double perimeter;
		double height;
		double volume;
		boolean contProgram = true;
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		
		while (contProgram) {
			
			//get variables
			System.out.print("\nEnter Length: ");
			length = scanner.nextDouble();
			System.out.print("Enter Width: ");
			width = scanner.nextDouble();
			System.out.print("Enter Height: ");
			height = scanner.nextDouble();
			
			//display results
			area = length * width;
			perimeter = (2 * length) + (2 * width);
			volume = length * width * height;
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.println("Volume: " + volume);
			
			//continue?
			System.out.print("\nContinue? (y/n): ");
			if (scanner.next().startsWith("n")) {
				contProgram = false;
			}
		}
		
		scanner.close();

	}

}
