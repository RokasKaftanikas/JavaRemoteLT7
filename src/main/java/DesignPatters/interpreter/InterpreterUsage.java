package DesignPatters.interpreter;

public class InterpreterUsage {
    public static void main(String[] args) {
        final MathOperationApplier mathOperationApplier = new MathOperationApplier();
        Double mathOperationApplierResult = mathOperationApplier.apply(MathOperation.MULTIPLY, 5.0d, 4.4);
        System.out.println(mathOperationApplierResult);


        Interpreter interpreter = new PythonStyleWithoutOrderMathOperationsInterpreter(mathOperationApplier);

        String result = interpreter.interpret("2 * 10");
        System.out.println(result);

//        HW - suprasti kokia reiksme turi buti paduodama į args[1]
//        interpreter = new WordsWithoutOrderMathOperationsInterpreter(mathOperationApplier);
//        result = interpreter.interpret(args[1]);
//        System.out.println(result);
    }
}
