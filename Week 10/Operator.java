import java.util.function.BiFunction;

public class Operator {

    public static Double operate(BiFunction<Double, Double, Double> func, double a, double b) {
        return func.apply(a, b);
    }

    public static void main(String[] args) {
        // Define various operations using lambdas
        BiFunction<Double, Double, Double> add = (a, b) -> a + b;
        BiFunction<Double, Double, Double> subtract = (a, b) -> a - b;
        BiFunction<Double, Double, Double> multiply = (a, b) -> a * b;
        BiFunction<Double, Double, Double> divide = (a, b) -> a / b;
        // A new operation can be added easily
        BiFunction<Double, Double, Double> power = (a, b) -> Math.pow(a, b);

        System.out.println("Addition: " + operate(add, 10.0, 5.0));
        System.out.println("Subtraction: " + operate(subtract, 10.0, 5.0));
        System.out.println("Multiplication: " + operate(multiply, 10.0, 5.0));
        System.out.println("Division: " + operate(divide, 10.0, 5.0));
        System.out.println("Power: " + operate(power, 10.0, 2.0));
    }
}