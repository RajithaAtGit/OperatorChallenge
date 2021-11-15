package com.gtrxone;

public class Main {

    public static void main(String[] args) {
        double myFirstDoubleValue = 20.00d;
        double mySecondDoubleValue = 80.00d;
        double result = (myFirstDoubleValue + mySecondDoubleValue) * 100.00d;
        System.out.println("myFirstValue + mySecondValue *100 = " + result);
        double theRemainder = result % 40.00d;
        System.out.println("theRemainder = " +theRemainder);
        boolean isRemainderZero = (theRemainder == 0) ? true : false;
        System.out.println("isRemainderZero " + isRemainderZero);

        if (isRemainderZero == false){
            System.out.println("Got some theRemainder");
        }
    }
}
