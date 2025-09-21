package OOPsBasics;
public class BookManagement {


    // Dummy implimentation for demo
    public boolean checkOutBook(Student student, Book book)
    {
        System.out.println("Student " +student.Name + " is taking book " + book.getTitle());
        return true;
    }

    public boolean returnBook(Student student , Book book)
    {
        System.out.println("Student " +student.Name + " is returning book " + book.getTitle());
        return true;
    }


}
