package org.example;

import org.example.calculate.NewArithmeticOperator;

public class SubtractionOperation implements NewArithmeticOperator {

    @Override
    public boolean supports(String operator) {
        return "-".equals(operator);
    }

    @Override
    public int calculate(int operand1, int operand2) {
        return operand1 - operand2;
    }
}
