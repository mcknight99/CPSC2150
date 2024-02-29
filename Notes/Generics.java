public class Generics {
    /*
     * Generics in java allow us to make interfaces and classes reusable by parameterizing them
     *      c++ calls them templates
     * 
     *  which is an example of a generic type? 
     *  -int, Integer, BoardPosition, List. Answer: List (it is flexible to any data type)
     * 
     * Reference types: java is always call by reference
     * when using generics, we have to use reference types because they point to memory addresses
     * 
     * Wrapper & autoboxing & unboxing 
     * autoboxing primitive --> wrapper
     * unboxing wrapper --> primitive
     * boolean -> Boolean
     * char -> Character
     * int -> Integer
     * double -> Double
     */

    //X is now a pointer to a memory address that holds x = 45
    //Integer X = new Integer(45);
    //X = 37; 
    //java garbage collector comes and picks up the new inaccessible original object with value 45

    //if we add X to an array and modify X, the value in the array will change accordingly, 
    //because both the list and the variable are pointing to the same value

}
