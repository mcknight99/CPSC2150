package studying;

public interface IChild extends IParent{
    public int getAge();
    public int setAge(int aA);
    @Override public default void print() {
        System.out.println("IChild: " + getLastName() + ", " + getAge());
    }
}