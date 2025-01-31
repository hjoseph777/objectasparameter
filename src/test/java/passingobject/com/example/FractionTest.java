package passingobject.com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class FractionTest {
    
    @Test
    public void testFractionCreation() {
        Fraction f = new Fraction(1, 2);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testAddFractions() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Calculator calculator = new Calculator();
        Fraction result = calculator.addFractions(f1, f2);
        assertEquals(5, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testMultiplyFractions() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 3);
        Calculator calculator = new Calculator();
        Fraction result = calculator.multiplyFractions(f1, f2);
        assertEquals(2, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testGetDecimal() {
        Fraction f = new Fraction(1, 2);
        Calculator calculator = new Calculator();
        assertEquals(0.5, calculator.getDecimal(f), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroDenominator() {
        new Fraction(1, 0);
    }
}