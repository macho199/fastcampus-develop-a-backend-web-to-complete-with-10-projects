package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * 요구사항
 * 간단한 사칙연산을 할 수 있다.
 * 양수로만 계산할 수 있다.
 * 나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다.
 * MVC패턴(Model-View-Controller) 기반으로 구현한다.
 */
public class CalculatorTest {
    @DisplayName("덧셈 연산을 수행한다.")
    @ParameterizedTest
    @MethodSource("fomulaAndResult")
    void calcualtionTest(int operand1, String operator, int operand2, int result) {
        assertThat(Calculator.calculate(operand1, operator, operand2)).isEqualTo(result);
    }

    private static Stream<Arguments> fomulaAndResult() {
        return Stream.of(
                arguments(1, "+", 2, 3),
                arguments(2, "-", 1, 1),
                arguments(2, "*", 2, 4),
                arguments(4, "/", 2, 2)
        );
    }
}
