public class Shapes {
	
	public static void calculateArea(String shapeType, int side, int width) {
	    int area = 0;
	    
	    if (shapeType == "Square") {
	        area = side * side;
	    } else if (shapeType == "Rectangle") {
	        area = side * width;
	    } else if (shapeType == "Circle") {
	        area = (int)(3.14 * side * side);
	    }
	    printArea(shapeType, area);
	   
	}
	
	public static void printArea(String shapeType, int area) {
		System.out.println("Area of " + shapeType + " : " + area);
	}
	
    public static void main(String[] args) {
        int squareSide = 7;
        int rectangleWidth = 8;
        int rectangleHeight = 3;
        int circleRadius = 10;
        
        calculateArea("Square", squareSide, 0);
        calculateArea("Rectangle", rectangleWidth, rectangleHeight);
        calculateArea("Circle", circleRadius, 0);
    }
}