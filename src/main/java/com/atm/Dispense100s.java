package com.atm;

public class Dispense100s implements ChainATM_Interface {

    private ChainATM_Interface chainATMInterface;

    @Override
    public void theNext(ChainATM_Interface chainATMInterface) {
        this.chainATMInterface = chainATMInterface;
    }

    @Override
    public void dispense(Money money) {
        if(money.getAmount() >=100) {
            int numberOfNotes = money.getAmount()/100;
            int remainder = money.getAmount() % 100;
            System.out.println("Dispensing " + numberOfNotes  +" notes of $100");
            if(remainder !=0) {
                chainATMInterface.dispense(new Money(remainder));
            }

        }else {
            chainATMInterface.dispense(money);
        }

    }
}
