package OOPsAdvance;

public class Application {
    public static void main(String[] args){

        // We cannot create the object of abstract class 

        // Parent class object
        /*System.out.println("Parent Class Object : LibraryItem");
        LibraryItem item1 = new LibraryItem("123", "PCS", "Ananya");
        item1.displayInfo();*/

        //System.out.println("-----------------");
        
        // -- Try this when you are learning about abstract class and interface
        // Why we can't assign the object of one child class to the variable of type another child class 
        
        /* Book bookalpha;
        bookalpha = new Magazine(); */

        // line 18 and 19 code will not work it will only work in case of interfaces

        // Child class object (Book class)
        System.out.println("Child Class object - Book class");
        Book book1 = new Book("8050", "DSA", "Varsha", 250);
        book1.displayInfo();

        //Calling implemented or defined abstract method of Book class
        book1.checkOut();

        // book1.Pages = 123;   you cannot access private members directly like this  ERROR - not visible

        System.out.println("-----------------");

        // Child Class (Magzine class)
        System.out.println("Child class object - Magzine class");
        Magzine magzine1 = new Magzine("311", "Java", "Jyothi", 100);
        magzine1.displayInfo();

        // Calling abstract method checkOut in Magzine
        magzine1.checkOut();

        System.out.println("------------------");

        // Child Class (EBook class)
        System.out.println("Child Class object - EBook class");
        EBook ebook1 = new EBook("007", "Aptitude", "Santhosh Sir", 150, "pdf");
        ebook1.displayInfo();
        System.out.println("File Formate :" +ebook1.getFileFormate());  //you can do this or you can override the displayInfo method in EBook class and u can display like that as well

        System.out.println("------------------");

        // Method overloading
        ebook1.search("PCS");
        ebook1.search("Ananya", "123");
    }
}
