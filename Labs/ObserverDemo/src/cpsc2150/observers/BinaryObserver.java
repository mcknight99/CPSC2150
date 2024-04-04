package cpsc2150.observers;

import cpsc2150.subject.MyInteger;

import static java.lang.Integer.*;

public class BinaryObserver extends AbsObserver{
    private MyInteger subject;

    /**
     * sets the subject of this observer as the given subject and registers this observer with the subject
     *
     * @param aSubject the subject to observer
     * @pre aSubject != null
     * @post subject = aSubject AND [The observer is registered with the subject aSubject]
     */
    public BinaryObserver(MyInteger aSubject) {
        this.subject = aSubject;
        this.subject.registerObserver(this);
    }

    /**
     * This method updates the observer with the new value of the subject and prints the new value in binary
     *
     * @pre none
     * @post [The new value of the subject is printed in binary]
     */
    @Override public void update() {
        System.out.println("Binary String: " + toBinaryString(subject.getValue()));
    }
}
