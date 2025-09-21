package OOPsInterfaces;

public class Application {
    public static void main(String[] args) {
        AlphaLibManagement AlphaApp;  // Declaring variable of type AlphaLibManagement
        AlphaApp = new AlphaLibManagement(); // Creating an object of type AlphaLibManagement and assign to AlphaApp variable

        AlphaApp.checkOut();

        System.out.println("------------------");

        boolean isAlpha = true; // Hardcoding the flag , but this could be read from config or run time

        ILibManagement appHandler; // Declaring variable of type Interface (ILibManagement)

        if(isAlpha)  //if true -- Alpha will get execute
        {
            appHandler = new AlphaLibManagement(); // Creating an object of type AlphaLibManagement and assign to app2 variable.
        }
        else  // else false -- Beta will get execute
        {
            appHandler = new BetaLibManagement();
        }
        
        // common code for the application
        appHandler.init();
        appHandler.checkIn();
        appHandler.checkOut();


    }
}
