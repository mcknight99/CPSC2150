package cpsc2150.subject;

import cpsc2150.observers.AbsObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implements a mutable integer reference object, where it
 * notifies any interested observers about changes to its internal value.
 *
 * Steps for updating this file:
 * 1. Create and initialize a set/list of interested observers
 * 2. Notify our interested observers when we update our value
 * 3. Implement "registerObserver", "unregisterObserver" and "notifyObserver"
 *
 * Modified from https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
 *
 * @version 1.0
 */
public class MyInteger
{
    /**
     * List of interested observers
     */
    private List<AbsObserver> myObservers;
    /**
     * Integer value to track
     */
    private int myValue;

    /**
     * default constructor for MyInteger. Initializes the internal integer value to 0 and creates an empty list of observers.
     *
     * @pre none
     * @post myValue = 0 AND myObservers = new ArrayList<>()
     */
    public MyInteger() {
        myValue = 0;
        myObservers = new ArrayList<>();
    }

    /**
     * This method registers an observer to the list of interested observers.
     *
     * @param observer An observer to register
     * @pre observer != null
     * @post myObservers.contains(observer) == true
     */
    public void registerObserver(AbsObserver observer) {
        myObservers.add(observer);
    }

    /**
     * This method unregisters an observer to the list of interested observers
     *
     * @param observer An observer the unregister
     * @pre observer != null AND myObservers.contains(observer) == true
     * @post myObservers.contains(observer) == false
     */
    public void unregisterObserver(AbsObserver observer) {
        //Step 3 goes here
        myObservers.remove(observer);
    }

    /**
     * This method notifies all interested observers about the change in the internal value.
     *
     * @pre |myObservers| > 0
     * @post [All observers in myObservers have been notified about the change in my value] AND myObservers = #myObservers
     * AND myValue = #myValue
     */
    public void notifyAllObservers() {
        for(AbsObserver observer: myObservers) { observer.update(); }

    }

    /**
     * This method returns the wrapped integer value.
     *
     * @return The internal integer value.
     * @pre none
     * @post getValue = myValue AND myObservers = #myObservers
     */
    public int getValue() {
        return myValue;
    }

    /**
     * This method updates the wrapped integer value
     *
     * @param newVal A new integer value
     * @pre none
     * @post myValue = newVal AND myObservers = #myObservers
     */
    public void setValue(int newVal) {
        myValue = newVal;
        notifyAllObservers();
    }

}
