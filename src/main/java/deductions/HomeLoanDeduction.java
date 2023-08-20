package deductions;

public class HomeLoanDeduction extends Deduction {


    public HomeLoanDeduction(double deductionAmount) {
        super(deductionAmount);
    }

    @Override
    public DeductionType getType() {
        return DeductionType.HOME_LOAN;
    }
}
