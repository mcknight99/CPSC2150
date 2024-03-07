import java.util.ArrayList;

/**
 * A generic stack interface. A stack is a collection of elements, with two main principal operations:
 * push, which adds an element to the collection, and pop, which removes the most recently added element that was not yet removed.
 * The order in which elements come off a stack gives rise to its alternative name, LIFO (last in, first out).
 * Additionally, a peek operation may give access to the top without modifying the stack.
 * The stack is a linear data structure, and the order of elements is maintained by the stack.
 *
 * @defines size: max number of elements the stack can hold
 *          self: the stack
 *
 * @constraints size > 0 AND 0 <= |self| <= size
 *
 * @initialization_ensures an empty stack is created with a max number of elements the stack can hold equal to size
 * 
 *  * @defines – Used to “hint at” private data contained within a class.
 * @constraints – the “invariant” of the interface. This “invariant” would be
 *              true for all
 *              possible implementation of the interface, “always”.
 * @initialization_ensures – what is going to be true about any class that
 *                         implements the
 *                         interface after the constructor is called.
 * @defines hints at the fact that any implementation is going to have “some
 *          kind of private data used to represent the max number of elements”.
 *          This means, instead of referring directly to the private data,
 *          capacity and elements, we can instead
 *          refer to this “max number of elements” as “size”, and the data
 *          structure that makes up the stack as “self”.
 * 
 * @constraints is the “invariant” for all possible implementations; the
 *              interface. It is what
 *              must “always” (and remember what quote “always” end-quote means)
 *              be true about the state of any implementing object, regardless
 *              of what implementation I use. Often, my @constraints are the
 *              same as any implementing classes @invariant except
 *              the @constraint still can’t refer to private data, so it uses
 *              the data we hinted at in the @defines instead.
 * @initializtion_ensures is effectively an abstract way
 *                        of writing the postcondition for all possible
 *                        implementations’ constructors.
 */
public interface IStack<T>
{

    /**
     * Get the elements of the stack.
     *
     * @pre none
     *
     * @post getElements = self AND self = #self AND #size = #size
     */
    public ArrayList<T> getElements();

    /**
     * Get the capacity of the stack.
     *
     * @return the capacity of the stack
     *
     * @pre none
     *
     * @post getCapacity = size AND self = #self AND #size = #size
     */
    public int getCapacity();

    /**
     * Push a value into the stack. If the stack is full, the longest-standing element will be removed to make space.
     *
     * @param value the value to be pushed into the stack
     *
     * @pre none
     *
     * @post |self| = |self| + 1 AND self = [#self with the item pushed into the stack where if the stack is full,
     * the longest-standing element is removed from the stack] AND #size = #size
     *
     */
    public default void push(T value) {
        ArrayList<T> stack = getElements();
        if(getElements().size()==getCapacity()) {
            stack.remove(0); //mutates elements arraylist
        }
        stack.add(value); //mutates elements arraylist
    }

    /**
     * Pop a value from the stack.
     *
     * @return the value popped from the stack
     *
     * @pre elements.size() > 0
     *
     * @post pop = [The item last pushed into the stack] AND |self| = |self| - 1 AND self = [#self except
     * the item last pushed into the stack has been removed] AND #size = #size
     */
    public default T pop() {
        ArrayList<T> stack = getElements();
        T element = stack.get(getElements().size()-1); 
        stack.remove(getElements().size()-1); //mutates elements arraylist
        return element;
    }

    /**
     * Peek the value from the top of the stack.
     *
     * @return the last pushed-in value of the stack
     *
     * @pre elements.size() > 0
     *
     * @post peek = [The item last pushed into the stack] AND self = #self AND #size = #size
     */
    public default T peek() {
        return getElements().get(getElements().size()-1);
    }

    /**
     * Get the size of the stack. The size of the stack is defined as the number of elements in the stack.
     *
     * @return the size of the stack
     *
     * @pre none
     *
     * @post getSize = |self| AND self = #self AND #size = #size
     */
    public default int getSize(){
        return getElements().size();
    }
}
