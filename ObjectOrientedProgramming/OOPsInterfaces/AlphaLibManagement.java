package OOPsInterfaces;

public class AlphaLibManagement implements ILibManagement {
    public void checkOut()
    {
        System.out.println("Alpha software : Checking out the books");
    }

    public void checkIn()
    {
        System.out.println("Alpha software : Checking in the books");
    }

    public void init()
    {
        System.out.println("Alpha software : Initializing ..");
    }
}
