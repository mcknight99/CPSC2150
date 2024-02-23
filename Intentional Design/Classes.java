



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
     * An interface describes what a class should do, but not how they should do it
     * An interface is where interactions occur. A user interface is the interface between the user and a program
     * Interfaces express coherent concepts (stacks, queues, sets, etc) and provide available methods and contracts
     * Clients ignore the implementation and rely on just the interface
     * 
     * Some interfaces are built into java
     * List myList = new ArrayList();
     * List=/= ArrayList
     * List is an interface in Java. List is an interface, ArrayList is a class that implements the interface
     * 
     * 
     * From classes to interfaces
     * A class is a particular solution to a specific problem
     * In general there are many ways to go about solving a problem (like sorting: merge, bubble, quick, insertion, select). 
     *  each method has a benefit and downside
     * 
     * Trade off examples:
     *  ex: interface "Grid"
     *  GridFast - 2d array of characters; quick to access but horrid in terms of memory
     *  GridMem - uses a list of <character, row, column>; slow to access but memory efficient
     *
     * Grid myGrid; 
     * if(//memory usage is important) {
     *  myGrid = new GridMem();
     * } else if(//execution performance is important) {
     *  myGrid = new GridFast();
     * }
     * 
     * public interface Fruit {
     *  void setWeight(double aWeight);
     * }
     * 
     * 
     * //is this interface valid? false
     * //because it has a constructor, it should not have a constructor in the interface
     * //interfaces dont have private members
     * //by default, unspecified members are public. should be public and static and makes it true
     * // if it were private int MIN_AGE then it would be false
     * interface Voter {
     *  int MIN_AGE = 18;
     * Voter(short age);
     * void Register(District d);
     * boolean isRegistered();
     * }
     * 
     * 
     * what contains the code? the class that implements the interface NOT the interface
     * what contains private attributes? the class that implements the interface NOT the interface
     * 
     * The declared type of a variable can be an interface
     * interface Fruit{}
     * Fruit Apple; //OK
     * Apple = new Fruit(); //NOT OK - interfaces don't have constructors
     * Fruit Apple = new Apple(); //OK
     * 
     * Declared type is set at compile time by declaration
     * Dynamic type is set at run time by assign statements
     * 
     * Apple a = new Apple("red");
     * Fruit f = new Apple("green");
     * 
     * f = a;//dynamic type of f is
     * 
     * Compiler cannot infer dynamic type
     * void pick(Fruit f)
     * 
     * Operator instanceof is the run time type
     * if(f instanceof Apple) {
     * 
     * } else if(f instanceof Pear) {
     * 
     * }
     * 
     * declared types determine which members (functions) can be used
     * 
     * class Apple implements Fruit{
     *  public void setW()
     * public double getC()
     * }
     * class Pear implements Fruit{
     *  public void setW()
     * public Boolean isRipe()
     * }
     * 
     * void pick(Fruit f) {
     *  f.setW()
     *  f.getC() //compile time error
     * }
     * 
     *  if(f instanceof Apple) {
     *  Apple a = (Apple) f;
     * a.getC();
     * }
     * 
     * 
     * Interfaces can ONLY be used as a declared type
     *  -interfaces are never dynamic types
     *  -interfaces are never instantiated
     *  -all dynamic types are classes
     *  -all run-time objects are constructed from a class, not an interface
     * 
     * Code is written based only on the interface
     *  -no implementation based on the 
     * 
     * 
     * 
     * "Implements"
     * the implements relation may hold between a class and an interface
     * if Class c implements Interface i then c contains code for the behaviors specified in interface i
     * 
     * Since Java 8, we have default implementation
     * this is what allows us to add code to interface files so long as it is a default or static method
     * We only use default methods to add secondary methods to our interface
     * 
     * A primary operation is a method that needs access to private data, needed to do anything useful
     *      just used with direct data access
     *      only purpose is to directly access private data and return or modify it
     *      ex. pop, push, length for a stack
     * A secondary operation ("default") is a method that does not need direct access to private data
     *      DO NOT NEED ACCESS TO PRIVATE DATA DIRECTLY --> are implemented with primary operations
     *      gets access via other methods, if we define a method called "top" for a stack that returns the top item 
     *      without removing it from the stack, it is secondary
     * 
     * A primary operation needs access to private data of a class
     * the core purpose of a primary operation is NOT for implementing secondary operations
     * 
     * A default or secondary operation can be replaced by caling other existing operations
     * 
     * In implementation, we use default to define a default method
     * 
     * class Fruit{
     *  default void foo()
     * }
     * 
     * class Apple implements Fruit{
     *  public void foo()//defaults to Fruit implementation if this isn't implemented
     * }
     *  
     * 
     */
}
