package OOPsAdvance;

public class EBook extends Book {
    
    private String fileFormate;

    public EBook(String id, String title, String author, int pages, String fileformate)
    {
        super(id, title, author, pages);
        this.fileFormate = fileformate;
    }

    public String getFileFormate()
    {
        return fileFormate;
    }

    // Method overloading 
    // Same Mthod name with different parameters
    public void search(String name)
    {
        System.out.println("Searching by name : " +name);
    }

    public void search(String author,  String id)
    {
        System.out.println("Searching by Author : " +author);
    }
}
