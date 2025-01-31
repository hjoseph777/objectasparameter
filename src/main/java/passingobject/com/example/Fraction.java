package passingobject.com.example;

public class Fraction {  
    private int numerator;
    private int denominator;

    // Constructor
    public Fraction(int numerator, int denominator) {  '
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
    }

    // Getters and Setters
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
    }
}
