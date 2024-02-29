



public class Classes {
    /*
     * Invariants - a third clause in our contract
     * used to describe the class and its instance variables, not just once function
     * preconditions are true before a method call or event
     * postcondiitons are true after a method call or event
     * invariants are "always true" - it can temporarily be false but must be true again after the method it is being changed in is over
     * 
     * 1. can be false before constructor call
     * 2. can be false during method execution
     * 
     * invariants should be true after the constructor is called, before and after any public method is invoked
     * the invariant may not be true within public method or 
     * 
     * bonus
     * which is an acceptable time for invariant to be false
     * during the execution of a public method or the constructor
     * 
     * the invariant is always true: true or false. false, it can be false temporarily
     * 
     * @invariant (day >=1 AND day <=31) AND (month >=1 AND month <=12) AND (year>=0)
     * invariants are comparable to precondition, while invariant talks about the instance variables, pre talks about the parameters
     * 
     * 
     * good practice: member declaration
     * group members by visibility: private then public
     * members are defined at the top of a class in java
     * 
     * NO fields should be public, but methods can be. avoid incorrect use of getters/accessors and setters/mutators
     * getters and setters are often universal (each field gets a getter and setter)
     * in what instances would i not want my traditional getter and setter? --> 
     * 
     * 
     * we can classify our objects and classes by entity, boundary, and control objects. 
     * entity: one of the more common object types, represents real-world entities 
     *      such as cars, employees, pizzas, etc. can be more abstract. usually nouns.
     * boundary: represents interactions between the system and its users or other systems. 
     *      UI is boundary, Scanner is boundary. exists to create a connection, not to encapsulate data
     * control: responsible for the actual flow of the program, makes sure events happen in a certain order. 
     *      the main method is a type of control object. every class can have a main but leads to a lot of confusion
     * 
     * Song.java, SongFE.java, SongManager.java. Song contains our fields that are related to the song,
     *  SongManager helps helps store those songs in one spot, and SongFE was how we defined the order of operations for our program (main)
     * Song is best defined as which of the following objects? an entity object
     * SongManager is best described as a boundary object?
     * SongFE is a control object
     * 
     * 
     */
}
