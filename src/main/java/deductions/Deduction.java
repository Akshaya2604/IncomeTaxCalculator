package deductions;

public abstract class Deduction {

    private final double deductionAmount;

    protected Deduction(double deductionAmount) {
        this.deductionAmount = deductionAmount;
    }

    public abstract DeductionType getType();

}
