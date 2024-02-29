public class StackDriver
{
    public static void main(String[] args) {
        //Create a GenericStack of Integers with a capacity of 3
        IStack<Integer> stack = new GenericStack<>(3);
        stack.push(1);
        System.out.println(stack.toString());
        stack.push(2);
        System.out.println(stack.toString());
        stack.push(3);
        System.out.println(stack.toString());
        stack.push(4);
        System.out.println(stack.toString());
        stack.pop();
        System.out.println("Peek: " + stack.peek());
        System.out.println(stack.toString());
        System.out.println(stack.getSize());
        

    }
}
