import java.util.function.Function;

public class SalaryCalculator {

    // Higher-order function that takes a function and a value
    public static Double applyBonus(Function<Double, Double> bonusFunction, double salary) {
        return bonusFunction.apply(salary);
    }

    public static void main(String[] args) {
        // Define bonus functions
        Function<Double, Double> festivalBonus = salary -> salary * 1.1;
        Function<Double, Double> performanceBonus = salary -> salary * 1.25;

        double initialSalary = 50000.0;

        // Apply the performance bonus [cite: 2, 3]
        double salaryAfterPerformanceBonus = applyBonus(performanceBonus, initialSalary);
        System.out.println("Salary after performance bonus: " + salaryAfterPerformanceBonus);

        // Apply the festival bonus
        double salaryAfterFestivalBonus = applyBonus(festivalBonus, initialSalary);
        System.out.println("Salary after festival bonus: " + salaryAfterFestivalBonus);
    }
}