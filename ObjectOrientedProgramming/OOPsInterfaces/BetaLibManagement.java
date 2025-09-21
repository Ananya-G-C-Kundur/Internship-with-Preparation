package OOPsInterfaces;

public class BetaLibManagement implements ILibManagement {
    
    public void checkOut()
    {
        System.out.println("Beta software : Checking out the books");
    }

    public void checkIn()
    {
        System.out.println("Beta software : Checking in the books");
    }

    public void init()
    {
        System.out.println("Beta software : Initializing ..");
    }
}
