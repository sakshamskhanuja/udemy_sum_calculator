public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        // Setting values.
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

        // Addition and subtraction.
        System.out.println("add= "+ calculator.getAdditionResult());
        System.out.println("subtract= "+ calculator.getSubtractionResult());

        // Setting values.
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);

        // Multiplication and division.
        System.out.println("multiply= "+ calculator.getMultiplicationResult());
        System.out.println("divide= "+ calculator.getDivisionResult());
    }
}