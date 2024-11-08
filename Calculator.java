/**
 * The Calculator class provides basic methods for mathematical operations.
 * <p>
 * This class includes methods for addition, subtraction, multiplication, and division.
 * </p>
 * 
 * @author shivada-54,ashique-42,athu-24
 * @version 1.0
 */
public class Calculator {

    /**
     * Adds two integers and returns the result.
     * 
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of a and b.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first and returns the result.
     * 
     * @param a The first integer.
     * @param b The second integer.
     * @return The result of a minus b.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers and returns the result.
     * 
     * @param a The first integer.
     * @param b The second integer.
     * @return The product of a and b.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second and returns the result.
     * 
     * @param a The first integer.
     * @param b The second integer.
     * @return The quotient of a divided by b.
     * @throws IllegalArgumentException if the second argument is zero.
     */
    public int divide(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    /**
     * The main method to demonstrate the Calculator class.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(10, 5));
        System.out.println("Subtraction: " + calculator.subtract(10, 5));
        System.out.println("Multiplication: " + calculator.multiply(10, 5));
        System.out.println("Division: " + calculator.divide(10, 5));
    }
}
