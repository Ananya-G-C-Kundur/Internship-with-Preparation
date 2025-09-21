package OOPsBasics;
public class Application{

    public static void main(String[] args) {   //it is public because it should be accessable from JRE
        //static - no object can be created

        //int demo = 5; //creating an integer object and assigning the value 5 , allocated in the Stack
        
        // Declare the variable newStudent and create an object of type Student
        Student newStudent = new Student(); // Heap memory dynamic memory allocation
        

        System.out.println("The newStudent Object ");
        //Access the public variables of the class and update values
        newStudent.Name = "Anu";
        newStudent.Age = 21;
        //newStudent.Course = "Arts";
        newStudent.Hometown = "Davangere";

        // newStudent.ID = 1;  You can't access private variable like this , compile won't allow
        
        // System.out.println("Student Name is " +newStudent.Name); one way to print
        
        // access or invoke or calling public methods of the class for the object newStudent
        System.out.println("Student Name is :" +newStudent.getName()); //Another way
        System.out.println("Student age is :" +newStudent.getAge());

        // newStudent.updateName("Ananya");  You can't access private variable like this , compiler won't allow
        
        // Run time error NullPointerException
        Student secondStudent = null;
        if (secondStudent != null)
        {
            secondStudent.Name = "Sita";  // Dead code , this will never be executed
        }

        System.out.println("The secondStudent Object ");
        // Creating another student object with constructor taking input
        secondStudent = new Student("Varsha", 23, "Science" , "Bengalure");

        System.out.println("Student name is " +secondStudent.getName());
        System.out.println("Student age is " +secondStudent.Age);

        System.out.println("Book Management Object");

        BookManagement operations = new BookManagement();
        Book book1 = new Book("PCS", 
                              "Ananya", 
                              "Coding", 
                              "1");

        operations.checkOutBook(secondStudent, book1);
        operations.checkOutBook(newStudent, book1);

        operations.returnBook(newStudent, book1);
    }
}