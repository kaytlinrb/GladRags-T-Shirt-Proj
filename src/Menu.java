import java.util.Scanner;

public class Menu {


    static String name;
    static int choice;
    static String[] menuOptions= new String[] {"Browse Inventory", "Select an Item to Purchase",
            "Search for Product", "Show Cart", "Checkout", "Exit"};

    static Scanner scanner = new Scanner(System.in);



    public static void greeting() {
        System.out.println("*** HELLO NEW CUSTOMER ***");
        System.out.println("*** MAY WE PLEASE HAVE YOUR NAME? ***");
        name = scanner.nextLine();
        System.out.println("HELLO " + name.toUpperCase() + "! WELCOME TO GLAD RAGS!");
        System.out.println("");
    }

    public static void executeMenu() {
        System.out.println("---- MAIN MENU ----");
        System.out.println("Select an option below");
        System.out.println("");

        for(int i = 0; i< menuOptions.length; i++) {
            System.out.println(i + ".     " + menuOptions[i]);
        }
    }
}
