# Fraction Calculator Project LAB 4

This project implements a fraction calculator that performs basic arithmetic operations on fractions.

## Project Structure

```
objectasparameter/
│
├── src/
│   ├── main/java/passingobject/com/example/
│   │   ├── App.java
│   │   ├── Calculator.java
│   │   └── Fraction.java
│   └── test/java/passingobject/com/example/
│       └── FractionTest.java
│
├── images/
│   └── output.png
└── README.md
```

## Component Descriptions

### [App.java](src/main/java/passingobject/com/example/App.java)
- Main application entry point
- Handles user input for fraction values
- Demonstrates fraction addition and multiplication
- Displays formatted results

### [Calculator.java](src/main/java/passingobject/com/example/Calculator.java)
- Contains core arithmetic operations for fractions
- Implements addition and multiplication of fractions
- Provides decimal conversion and result formatting

### [Fraction.java](src/main/java/passingobject/com/example/Fraction.java)
- Defines the Fraction class structure
- Manages numerator and denominator values
- Includes input validation (prevents zero denominator)

### [FractionTest.java](src/test/java/passingobject/com/example/FractionTest.java)
- Contains unit tests for fraction operations
- Validates fraction creation and arithmetic operations
- Tests error handling for invalid inputs

## Sample Output

![Program Output](/images/output.png)

## Usage
Run the App.java file and follow the prompts to:
1. Enter numerator and denominator for first fraction
2. Enter numerator and denominator for second fraction
3. View the results of addition and multiplication operations
