package studying;

public interface IParent{
    public String getLastName();
    public String setLastName(String aLN);
    public default void print() {
        System.out.println("IParent: "+getLastName());
    }

}

