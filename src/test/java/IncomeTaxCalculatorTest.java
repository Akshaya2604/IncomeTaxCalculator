import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTaxCalculatorTest {
    @Test
    void twoLakhsShouldReturnZero(){
        //todo remove below line after testing
        //abcd
        var result=new IncomeTaxCalculatorTest();
        assertEquals(0,IncomeTaxCalculator.taxCalculation(200000));
    }
    @Test
    void fourLakhsShouldReturnOutput(){
        var result=new IncomeTaxCalculatorTest();
        assertEquals(92500,IncomeTaxCalculator.taxCalculation(400000));
    }
    @Test
    void sevenLakhsFiftyThousandShouldReturnOutput(){
        var result=new IncomeTaxCalculatorTest();
        assertEquals(262500,IncomeTaxCalculator.taxCalculation(750000));
    }
    @Test
    void twelveLakhsShouldReturnOutput(){
        var result=new IncomeTaxCalculatorTest();
        assertEquals(472500,IncomeTaxCalculator.taxCalculation(1200000));
    }
    @Test
    void fifteenLakhsShouldReturnOutput(){
        var result=new IncomeTaxCalculatorTest();
        assertEquals(575000,IncomeTaxCalculator.taxCalculation(1500000));
    }
    @Test
    void twentytwoLakhsShouldReturnOutput(){
        double income1=2200000;
        double tax=(0.3*income1)+125000;
        var result=new IncomeTaxCalculatorTest();
        assertEquals(tax,IncomeTaxCalculator.taxCalculation(2200000));
    }
    @Test
    void negativeIncomeShouldReturnException(){
        double income2=-230000;
        double tax=0;
        var result=new IncomeTaxCalculatorTest();
        //assertEquals(tax,IncomeTaxCalculator.taxCalculation(-230000));
        assertThrows(IllegalArgumentException.class,
                () ->{
                    IncomeTaxCalculator.taxCalculation(-230000);
                });
    }

}