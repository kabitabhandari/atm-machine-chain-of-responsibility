package com.atm;

public class Dispense200s implements ChainATM_Interface {

    private ChainATM_Interface chainATMInterface;

    @Override
    public void theNext(ChainATM_Interface chainATMInterface) {
        this.chainATMInterface = chainATMInterface;
    }

    @Override
    public void dispense(Money money) {
        if(money.getAmount() >=200) {
            int numberOfNotes = money.getAmount()/200;
            int remainder = money.getAmount() % 200;
            System.out.println("Dispensing " + numberOfNotes  +" notes of $200");
            if(remainder !=0) {
                chainATMInterface.dispense(new Money(remainder));
            }

        }else {
            chainATMInterface.dispense(money);
        }

    }
}
