package com.atm;

public interface ChainATM_Interface {
   void theNext(ChainATM_Interface chainATMInterface);
   void dispense(Money money);
}
