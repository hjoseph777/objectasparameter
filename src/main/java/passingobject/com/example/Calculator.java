package passingobject.com.example;

public class Calculator {

    // Get decimal value
    public double getDecimal(Fraction fraction) {
        return (double) fraction.getNumerator() / fraction.getDenominator();
    }

    // Add fractions
    public Fraction addFractions(Fraction f1, Fraction f2) {
        return new Fraction(
            f1.getNumerator() * f2.getDenominator() + f2.getNumerator() * f1.getDenominator(),
            f1.getDenominator() * f2.getDenominator()
        );
    }

    // Multiply fractions
    public Fraction multiplyFractions(Fraction f1, Fraction f2) {
        return new Fraction(
            f1.getNumerator() * f2.getNumerator(),
            f1.getDenominator() * f2.getDenominator()
        );
    }

    public String formatResult(Fraction fraction) {
        return String.format("The fraction's numerator is: %.1f, denominator is: %.1f and decimal version of fraction is: %f",
            (double)fraction.getNumerator(),
            (double)fraction.getDenominator(),
            getDecimal(fraction));
    }
}
