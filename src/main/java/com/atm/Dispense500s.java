package com.atm;

public class Dispense500s implements ChainATM_Interface {

    private ChainATM_Interface chainATMInterface;

    @Override
    public void theNext(ChainATM_Interface chainATMInterface) {
        this.chainATMInterface = chainATMInterface;
    }

    @Override
    public void dispense(Money money) {
        if(money.getAmount() >=500) {
            int numberOfNotes = money.getAmount()/500;
            int remainder = money.getAmount() % 500;
            System.out.println("Dispensing " + numberOfNotes  +" notes of $500");
            if(remainder !=0) {
                chainATMInterface.dispense(new Money(remainder));
            }

        }else {
            chainATMInterface.dispense(money);
        }

    }
}
