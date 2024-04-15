import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        calculator.setNum1(5);
        calculator.setNum2(3);
        calculator.setOperation('+');
        double result = calculator.getResult();
        Assertions.assertEquals(8, result, "Неверный результат сложения");
    }

    @Test
    void testSubtraction() {
        Calculator calculator = new Calculator();
        calculator.setNum1(10);
        calculator.setNum2(4);
        calculator.setOperation('-');
        double result = calculator.getResult();
        Assertions.assertEquals(6, result, "Неверный результат вычитания");
    }

    @Test
    void testMultiplication() {
        Calculator calculator = new Calculator();
        calculator.setNum1(3);
        calculator.setNum2(4);
        calculator.setOperation('*');
        double result = calculator.getResult();
        Assertions.assertEquals(12, result, "Неверный результат умножения");
    }

    @Test
    void testDivision() {
        Calculator calculator = new Calculator();
        calculator.setNum1(10);
        calculator.setNum2(2);
        calculator.setOperation('/');
        double result = calculator.getResult();
        Assertions.assertEquals(5, result, "Неверный результат деления");
    }

    @Test
    void testDivisionByZero() {
        Calculator calculator = new Calculator();
        calculator.setNum1(10);
        calculator.setNum2(0);
        calculator.setOperation('/');
        Assertions.assertThrows(IllegalArgumentException.class, calculator::getResult, "Деление на ноль должно выбрасывать исключение");
    }

    @Test
    void testInvalidOperation() {
        Calculator calculator = new Calculator();
        calculator.setNum1(10);
        calculator.setNum2(2);
        calculator.setOperation('?');
        Assertions.assertThrows(IllegalArgumentException.class, calculator::getResult, "Неверная операция должна выбрасывать исключение");
    }
}
