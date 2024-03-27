public class ObserverPattern {

    /*
     * We want to monitor the network for events
     * the machine on the network where the events occur is the subject of the interaction
     * The objects in your program that need to do something in response to the events for a 
     *      particular subject are called observers or listeners for that subject
     * 
     * Polling - the main continually polls each possible subject to ask whether any events have occurred 
     *      "has anything changed? if so, observer does something"
     * this is not the observer pattern, not a design pattern
     * 
     * Callbacks - the observer pattern, 
     *      each observer (there may be many) registers its interest in a subject's events and then waits until
     *      the subect calls it back to tell it that there has been an event
     * 
     *      removes the need to constantly ask the subject if the event has occurred 
     *      when the event happens in the subject, it triggers the callback to the observer
     *      sometimes the subject also passes data about the event to the observer
     *      there is an issue where there's a wait time in between the subject initiating the 
     *          callback and the observer acting on it. which is why polling still has some uses b/c it's faster
     * 
     * the obsever pattern:    
     *  each subject expects each observer to register itself with that subject if it's interested in the subject's events
     *  each subject keeps track of its own set of interested observers
     *  when an event occurs, the subject invokes a specific callback method for each registered observer,
     *      passing an event argument that describes the event
     * 
     * 
     *  if an observer needs to know when an event occurs to a subject the observer needs to register with the subject
     * 
     * 
     * the observer pattern 
     *      gui
     *      widgets on the screen
     *      we dont know what widget will be interacted with, the widgets are subjects and create observers for them
     * 
     * 
     * 
     * 
     * 
     * 
     */




}