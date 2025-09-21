package OOPsBasics;
public class Book {
    
    private String Title;
    private String Author;
    private String Category;
    private String ID;

    public Book(String bookTitle , String bookAuthor , String bookCategory , String id)
    {
        this.Title = bookTitle;
        this.Author = bookAuthor;
        this.Category = bookCategory;
        this.ID = id;
    }

    public void printBookDetails()
    {
        System.out.println(this.Title);
        System.out.println(this.Author);
        System.out.println(this.Category);
        System.out.println(this.ID);
    }

    public String getTitle()
    {
        return this.Title;
    }
}
