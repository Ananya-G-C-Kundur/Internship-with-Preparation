package OOPsAdvance;

// Child class of LibraryItem
public class Magzine extends LibraryItem{
    
    private int issueNumber;

    public Magzine(String id, String title, String author, int issueNumber)
    {
        super(id, title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Issue Number : " +issueNumber);
    }

    //Calling abstarct method
    public void checkOut()
    {
        // Dummy implimentation
        System.out.println(" Checking out the Magzine");
    }
}
