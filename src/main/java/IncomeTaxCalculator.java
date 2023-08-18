public class IncomeTaxCalculator{
    public static double taxCalculation(double income){
        double tax;
        if(income<=0){
            throw new IllegalArgumentException("Income must be positive");
        }else if(income<250000){
            return 0;
        } else if (income<500000) {
            tax=(0.2*income)+12500;
            return tax;
        } else if ( income<1000000) {
            tax=(0.2*income)+112500;
            return tax;
        } else if (income<1250000) {
            tax=(0.3*income)+112500;
            return tax;
        }else{
            tax=(0.3*income)+125000;
            return  tax;
        }
    }
}