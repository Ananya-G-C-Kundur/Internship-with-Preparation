package OOPsAdvance;

abstract class LibraryItem{

    public String ID;
    private String Title;
    protected String Author;

    public LibraryItem(String id, String title,String author)
    {
        this.ID = id;
        this.Title = title;
        this.Author = author;
    }

    public void setTitle(String titleName)
    {
        this.Title = titleName;
    }

    // Method to display details
    public void displayInfo()
    {
        System.out.println("ID : " +this.ID);
        System.out.println("Title : " +this.Title);
        System.out.println("Author : " +this.Author);
    }

    private void searchItem(String name)
    {
        System.out.println("Searching ");
    }

    protected void searchItems(String name)
    {
        System.out.println("Inside protected method - Searching ");
        this.searchItem(name);
    }

    // Declaring an abstarct method , all the child classes of this must implement this method.
    abstract public void checkOut(); // Method Declaration
}