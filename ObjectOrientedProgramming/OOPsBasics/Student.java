package OOPsBasics;
public class Student {

    private static int count = 0;

    //Member variable of the class
    public String Name;
    public int Age;

    private String Course;
    private int ID;
    
    protected String Hometown;


    // Constructor method will not have return type including void
    // Constructor is special function or method to create object
    public Student(String name, int age, String course, String hometown)
    {
        this.Name = name;
        this.Age = age;
        this.Course = course;
        this.Hometown = hometown;

        this.register();
    }

    //Constructor which doesn't take any input parameters or functions arguments 
    public Student()
    {

    }

    // Special function constructor which only takes name as input
    public Student(String name)
    {
        this.Name = name;
    }

    public String getName()
    {
        return this.Name;
    }

    public int getAge()
    {
        return this.Age;
    }

    public String getCourse()
    {
        return this.Course;
    }

    public String getHometown()
    {
        return this.Hometown;
    }

    //Register the student and returns the ID
    private int register()
    {
        count++;
        this.ID = count;
        return this.ID;
    }

    private void updateName(String name)
    {
        this.Name = name;
    }

    protected void updateAge(int age)
    {
        this.Age = age;
    }
}
