package ifs;

public abstract class InsuranceStrategy {
    double calculate(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    abstract int getConstant();

    abstract double getWeight();

    abstract int getAdjustment();
}
