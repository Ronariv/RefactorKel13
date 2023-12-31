
import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	static int shapeArea = 0;
    static String shapeName = "";
	
	public static void printHeaderMenu() {
		System.out.println("Menu\n========");
        System.out.println("1. Calculate Rectangle Area");
        System.out.println("2. Calculate Square Area");
        System.out.println("3. Calculate Circle Area");
        System.out.println("0. Exit");
        System.out.print("Input: ");
	}
	
	public static int calculateSquareArea() {
	    
	    System.out.print("Enter side length: ");
	    int side = scanner.nextInt();
	    
	    return (side * side);
	}

	public static int calculateRectangleArea() {
		
	    System.out.print("Enter width: ");
	    int width = scanner.nextInt();

	    System.out.print("Enter height: ");
	    int height = scanner.nextInt();
	    
	    return (height * width);
	}

	public static int calculateCircleArea() {
		
	    System.out.print("Enter radius: ");
	    double radius = (double) scanner.nextInt();
	   
	    return (int) (3.14 * radius * radius);
	}
	
	public static void printArea(String shapeName, int shapeArea) {
		System.out.println("Area of " + shapeName + " is: " + shapeArea);
	}
        
	public static void menu() {
	    
	    int input = scanner.nextInt();
	    
	    do {
	        printHeaderMenu();
	        
	        if (input == 1) {
	        	shapeName = "Rectangle";
	        	shapeArea = calculateRectangleArea();
	        } else if (input == 2) {
	        	shapeName = "Square";
	        	shapeArea = calculateSquareArea();
	        } else if (input == 3) {
	        	shapeName = "Circle";
	        	shapeArea = calculateCircleArea();
	        }
	        
	        if(1 <= input && input <= 3) {
	        	printArea(shapeName, shapeArea);
	        }
	        
	    } while (input != 0);
	}
	
    public static void main(String[] args) {
        menu();
    }
}
