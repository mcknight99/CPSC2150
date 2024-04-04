package cpsc2150;

import cpsc2150.observers.AbsObserver;
import cpsc2150.observers.BinaryObserver;
import cpsc2150.observers.HexaObserver;
import cpsc2150.observers.OctalObserver;
import cpsc2150.subject.MyInteger;

public class ObserverDemo
{
    public static void main(String[] args)
    {
        MyInteger integer = new MyInteger();
        AbsObserver hex = new HexaObserver(integer);
        AbsObserver octal = new OctalObserver(integer);
        AbsObserver binary = new BinaryObserver(integer);

        System.out.println("First value change: 15");
        integer.setValue(15);
        System.out.println("-----------------------");
        System.out.println("Second value change: 10");
        integer.setValue(10);
        System.out.println("-----------------------");
        System.out.println("Third value change: 999");
        integer.setValue(999);
        System.out.println("-----------------------");
        System.out.println("We're no longer interested in the octal value, so we unregister it.");
        integer.unregisterObserver(octal);
        System.out.println("Fourth value change: 100");
        integer.setValue(100);
        System.out.println("-----------------------");
        System.out.println("We're no longer interested in the binary value, so we unregister it.");
        integer.unregisterObserver(binary);
        System.out.println("we're once again interested in the octal value, so we register it.");
        integer.registerObserver(octal);
        System.out.println("Final value change: 1000");
        integer.setValue(1000);
        System.out.println("-----------------------");

    }
}
