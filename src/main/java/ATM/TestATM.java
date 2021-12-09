package ATM;

import org.junit.*;

public class TestATM {

    @Test
    public void testATM(){

        ATM atm1 = new ATM();

        atm1.process(210);
        atm1.process(10);
        atm1.process(5);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testATMerror(){
        ATM atm1 = new ATM();
        atm1.process(216);
    }

}
