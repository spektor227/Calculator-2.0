package com.company;

public class IntsCalculator implements Ints {
    protected final Calculator converted;

    public IntsCalculator() {
        this.converted = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        Calculator.Formula formula = converted.newFormula();
        return (int) formula.addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        Calculator.Formula formula = converted.newFormula();
        return (int) formula.addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public int sub(int arg0, int arg1) {
        Calculator.Formula formula = converted.newFormula();
        return (int) formula.addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUB)
                .result();
    }

    @Override
    public int div(int arg0, int arg1) {
        Calculator.Formula formula = converted.newFormula();
        return (int) formula.addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.DIV)
                .result();
    }

    @Override
    public int pow(int a, int b) {
        Calculator.Formula formula = converted.newFormula();
        return (int) formula.addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
    }
}
