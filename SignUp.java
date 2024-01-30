import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Welcome to Java Gram");

        System.out.println("\nWhat is your first name?");
        String firstname=scanner.nextLine();

        System.out.println("\n Whats your last name?");
        String lastname=scanner.nextLine();

        System.out.println("\n whats your age?");
        int age=scanner.nextInt();
        //next Linentrap
        scanner.nextLine();

        System.out.println("\nWhats your username?");
        String username=scanner.nextLine();

       System.out.println( "\n Whats your city of origin?");
        String city=scanner.nextLine();

        System.out.println( "\n Whats your country of origin?");
        String country=scanner.nextLine();

        scanner.close();

        System.out.println("Welcome "+firstname+" "+lastname+"!");
        System.out.println("Your account has been created.");
        System.out.println("Your username is "+username+" and you are "+age+" years old.");
        System.out.println("You are from "+city+", "+country+".");


    }
}
