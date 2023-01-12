## Sum Calculator

### Description

Write a class with the name <b>SimpleCalculator</b>. The class needs two fields (instance variables) with names <b>firstNumber</b> and <b>secondNumber</b> both of type <b>double</b>.

Write the following methods (instance methods):

<ul>
<li>Method named <b>getFirstNumber</b> without any parameters, it needs to return the value of <b>firstNumber</b> field.</li>
<li>Method named <b>getSecondNumber</b> without any parameters, it needs to return the value of <b>secondNumber</b> field.</li>
<li>Method named <b>setFirstNumber</b> with one parameter of type <b>double</b>, it needs to set the value of the <b>firstNumber</b> field.</li>
<li>Method named <b>setSecondNumber</b> with one parameter of type <b>double</b>, it needs to set the value of the <b>secondNumber</b> field.</li>
<li>Method named <b>getAdditionResult</b> without any parameters, it needs to return the result of adding the field values of <b>firstNumber</b> and <b>secondNumber</b>.</li>
<li>Method named <b>getSubtractionResult</b> without any parameters, it needs to return the result of subtracting the field values of <b>secondNumber</b> from the <b>firstNumber</b>.</li>
<li>Method named <b>getMultiplicationResult</b> without any parameters, it needs to return the result of multiplying the field values of <b>firstNumber</b> and <b>secondNumber</b>.</li>
<li>Method named <b>getDivisionResult</b> without any parameters it needs to return the result of dividing the field values of <b>firstNumber</b> by the <b>secondNumber</b>. In case the value of secondNumber is 0 then return 0.</li>
</ul>

### Test Code

    SimpleCalculator calculator = new SimpleCalculator();
    calculator.setFirstNumber(5.0);
    calculator.setSecondNumber(4);
    System.out.println("add= " + calculator.getAdditionResult());
    System.out.println("subtract= " + calculator.getSubtractionResult());
    calculator.setFirstNumber(5.25);
    calculator.setSecondNumber(0);
    System.out.println("multiply= " + calculator.getMultiplicationResult());
    System.out.println("divide= " + calculator.getDivisionResult());

### Output

    add= 9.0
    subtract= 1.0
    multiply= 0.0
    divide= 0.0
