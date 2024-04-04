package cpsc2150.observers;

/**
 * This Abstract class specifies the callback method that all numeric converters
 * must implement in order to print out the converted value.
 *
 * --No change is required in this file.--
 *
 * Modified from https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
 *
 * @version 1.0
 */
public abstract class AbsObserver
{
    public abstract void update();
}
