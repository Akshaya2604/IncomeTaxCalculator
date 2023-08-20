package processor;

import deductions.Deduction;
import deductions.DeductionType;

public class HomeLoanDeductionProcessor implements DeductionProcessor {


    @Override
    public double calculateDeductionAmount(Deduction deduction) {
        if(DeductionType.HOME_LOAN.equals(deduction.getType())){

        }
        return 0;
    }
}
