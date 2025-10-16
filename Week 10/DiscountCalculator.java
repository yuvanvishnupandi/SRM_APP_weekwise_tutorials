import java.util.function.Function;

public class DiscountCalculator {

    public static Function<Double, Double> createDiscountCalculator(double rate) {
        return price -> price * (1 - rate);
    }

    public static void main(String[] args) {
        // Create a function that applies a 10% discount
        Function<Double, Double> tenPercent = createDiscountCalculator(0.1);

        // Use the new function [cite: 13]
        double discountedPrice = tenPercent.apply(2000.0);
        System.out.println("Price after 10% discount: " + discountedPrice);

        // Create and use a 25% discount function
        Function<Double, Double> twentyFivePercent = createDiscountCalculator(0.25);
        System.out.println("Price after 25% discount: " + twentyFivePercent.apply(5000.0));
    }
}