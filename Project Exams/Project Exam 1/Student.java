import java.util.Calendar;

public class Student {
    private String name;
    private Calendar birthdate;
    private final int ID_NUMBER;
    private String major;

    /**
     * Constructs a new Student object with default values (empty strings, current date, ID 0)
     * 
     * @pre None
     * @post this.name = "" AND this.birthdate = [date of construction] AND this.ID_NUMBER=0 AND this.major=""
     */
    public Student() {
        this.name = "";
        this.birthdate = Calendar.getInstance();
        this.ID_NUMBER = 0;
        this.major = "";
    }

    /**
     * Parameterized Student constructor. Constructs a new Student object with passed in values
     * 
     * @param name The value to which this.name will be set
     * @param birthdate The value to which this.birthdate will be set
     * @param ID_NUMBER The value to which this.ID_NUMBER will be set
     * @param major The value to which this.major will be set
     * 
     * @pre name!=NULL AND birthdate!=NULL AND ID_NUMBER!= NULL AND major!=NULL
     * @post this.name = name AND this.birthdate = birthdate AND this.ID_NUMBER = ID_NUMBER AND this.major = major
     */
    public Student(String name, Calendar birthdate, int ID_NUMBER, String major) {
        this.name = name;
        this.birthdate = birthdate;
        this.ID_NUMBER = ID_NUMBER;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }

    public int getID_NUMBER() {
        return ID_NUMBER;
    }

    public String getMajor() {
        return major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(Calendar birthdate) {
        this.birthdate = birthdate;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * Returns the length of the String passed in
     * 
     * @param aName The string to evaluate the length of
     * @return [length of String aName, the amount of chars. An int]
     * 
     * @pre aName!=NULL
     * @post studentsStaticMethod = [length of String aName, the amount of chars. An int]
     */
    public static int studentsStaticMethod(String aName)
    {
        return aName.length();
    }

    public boolean equals(Object obj) {
        if(obj instanceof Student stu)
            return this.name.equals(stu.name) && this.birthdate.equals(stu.birthdate) && this.ID_NUMBER == stu.ID_NUMBER && this.major.equals(stu.major);
        return false;
    }
    
    public String toString() {
        return "Name: " + name + "\nBirthdate: " + birthdate + "\nID Number: " + ID_NUMBER + "\nMajor: " + major;
    }
}