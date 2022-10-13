import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String name;

        Scanner scanner = new Scanner(System.in);
        System.out.println("*** HELLO NEW CUSTOMER ***");
        System.out.println("*** MAY WE PLEASE HAVE YOUR NAME? ***");
        name = scanner.nextLine();
        System.out.println("HELLO " + name.toUpperCase() + "! WELCOME TO GLAD RAGS!");
    }
}