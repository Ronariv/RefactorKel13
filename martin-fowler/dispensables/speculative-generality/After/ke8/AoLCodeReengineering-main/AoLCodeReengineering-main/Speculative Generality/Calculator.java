public class Calculator {
    public static double add(double num1, double num2){
        return num1 + num2;
    }
    public static double substract(double num1, double num2){
        return num1 - num2;
    }
    public static double divide(double num1, double num2){
        return num1 / num2;
    }
    public static double modulo(double num1, double num2){
        return num1 % num2;
    }
    public static double multiply(double num1, double num2){
        return num1 * num2;
    }
    

    public static void main(String[] args) {
        Calculator.add(10, 5); // output: 15.0
        Calculator.substract(10, 5); // output: 5.0
        Calculator.multiply(10, 5); // output: 50.0
        Calculator.divide(10, 5); // output: 2.0
        Calculator.modulo(10, 5); // output: 0.0
    }
}
