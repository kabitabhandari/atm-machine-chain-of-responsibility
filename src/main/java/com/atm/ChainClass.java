package com.atm;

public class ChainClass {

    public ChainATM_Interface chain() {
        ChainATM_Interface dispense1000s = new Dispense1000s();
        ChainATM_Interface dispense500s = new Dispense500s();
        ChainATM_Interface dispense200s = new Dispense200s();
        ChainATM_Interface dispense100s = new Dispense100s();

        dispense1000s.theNext(dispense500s);
        dispense500s.theNext(dispense200s);
        dispense200s.theNext(dispense100s);

        return dispense1000s;
    }
}
