package com.atm;

public class Dispense1000s implements ChainATM_Interface {

    private ChainATM_Interface chainATMInterface;

    @Override
    public void theNext(ChainATM_Interface chainATMInterface) {
        this.chainATMInterface = chainATMInterface;
    }

    @Override
    public void dispense(Money money) {
        if(money.getAmount() >=1000) {
            int numberOfNotes = money.getAmount()/1000;
            int remainder = money.getAmount() % 1000;
            System.out.println("Dispensing " + numberOfNotes  +" notes of $1000");
            if(remainder !=0) {
                chainATMInterface.dispense(new Money(remainder));
            }

        }else {
            chainATMInterface.dispense(money);
        }

    }
}
