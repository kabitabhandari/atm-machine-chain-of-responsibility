package com.atm;

public class MainClass {


    public static void main(String[] args) {

        ChainClass chainClass = new ChainClass();
        chainClass.chain().dispense(new Money(900));
    }
}
