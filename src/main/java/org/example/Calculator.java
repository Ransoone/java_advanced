package org.example;

public class Calculator {
        private double num1;
        private double num2;
        private char operation;
        private double result;

        public void setNum1(double num1) {
            this.num1 = num1;
        }

        public void setNum2(double num2) {
            this.num2 = num2;
        }

        public void setOperation(char operation) {
            this.operation = operation;
        }
        /**
         * Метод, реализующий вычисление над двумя числами.
         */
        public double getResult() throws IllegalArgumentException {
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        throw new IllegalArgumentException("Деление на ноль невозможно!");
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Неверная операция!");
            }
            return result;
        }
    }

