package OOPsAdvance;

// Derived class or Child class
public class Book extends LibraryItem{
    private int Pages;

    public Book(String id, String title, String author, int pages)
    {
        super(id, title, author);
        this.Pages = pages;
    }

    @Override  
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Number of pages : " +this.Pages);
    }

    // Calling abstract method
    public void checkOut()
    {
        // Dummy implimentation
        System.out.println("Checking out the Book");
    }
}
