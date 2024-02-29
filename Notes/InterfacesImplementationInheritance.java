public class InterfacesImplementationInheritance {
/*
 * We can use inheritance to extend interfaces
 * Parent interface A (customerInterface)
 * Child interface B (deliveryCustomerInterface)
 * 
 * interface B extends A
 * Interface B implements defaults and primaries from A
 * 
 * Extends relation holds between two classes or two interfaces
 * In either case, if B extends A, then B inherits all fields and methods from A
 * B is able to add methods that are exclusive to B
 * While B inherits from A, we can override methods from A
 * 
 * When extending classes, 
 *  constructors are not inherited 
 *  we can refer to parent implementation via super() 
 *  static methods are inherited
 * 
 *  Can a class extends an inteface = NO
 *  
 *  public interface IntegerStackWTop extends IntegerStack {
 *  Integer top();
 * //Also implements all IntegerStack methods
 * }
 * 
 * 
 * If I have an interface I can't edit, extending it to a new interface will allow me to "edit" it
 * We can still make default methods, so long as we implement them in the child interface
 * When we go to implement these interfaces, we typically implement the child interface
 * 
 * Class 4 extends Class 3 implements Interface 2 extends Interface 1 = Class 4 implements Interface 1
 * 
 * All classes in java extend the Object class which has methods
 *  Boolean equals(Object obj)
 *  Int hashCode()
 *  String toString()
 * And we can override these to make them more meaningful in our implementation
 * 
 * It is true that the methods provided by Object can be written using only primary operations, like our default/secondary methods
 *  However, interfaces do not extend object. An interface ISNT a class
 * 
 * C4 extends C3
 * C4.foo() calls C4's foo. Will always try to call the child's function or most childlike function
 * 
 * When java is determining which version of a *primary*, *overriden* method to run, how will it make that decision at compile time
 * it will use the method in the declared type
 * it will not use the method in the interface because it is a primary function. 
 * It will not use the default implemention in the interface because if there is an override, Java will use the override
 * It will not use the method in the dynamic type because it is at compile time so it is the declared type
 * 
 * Abstract classes are a relic of the past
 * Pre Java 8, there were no default methods
 * Abstract classes were how we included data for fields like we can do with defaults
 * Abstract classes can include data fields and code for methods even if they aren't default
 * But this was more helpful pre J8
 * abstract classes are rare nowadays
 * 
 * When to use abstract class?
 * If you want to define data fields that every subclass must contain
 * Provide methods that use those data fields that every subclass can inherit
 * Many design patterns will refer to using abstract classes 
 *  partially because abstract classes exist outside of Java, where there are no interfaces
 *  An abstract class with no data fields is basically an interface
 *      Declare primary methods as abstract
 *      add secondary methods that use the primary
 *      subclasses override the primary methods and inherit the secondary
 * 
 * T/F an abstract class can only have data fields that are static: FALSE
 * 
 * 
 */

}