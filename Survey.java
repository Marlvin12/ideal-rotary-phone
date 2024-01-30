import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {


    //To pick int =scanner.nextInt();
    //To pick double =scanner.nextDouble();
    //To pick String =scanner.nextLine();
    //To pick char =scanner.next().charAt(0);
    Scanner scanner = new Scanner(System.in);
    int counter=0;
        System.out.println("Welcome. Thank you for taking the survey");


        System.out.println("\nWhat is your name?");
        String name=scanner.nextLine();
        counter++;

        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice=scanner.nextDouble();
        counter++;

        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice=scanner.nextDouble();
        counter++;


        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmount=scanner.nextInt();
        counter++;

        System.out.println("\nHow many times a week do you buy fast food?");
        int foodAmount=scanner.nextInt();
        counter++;

        scanner.close();

        //*********PART B: RESPONDING TO THE USER**********
        System.out.println("Thank you "+ name + " for answering all "+counter+" questions");
        System.out.println("Weekly, you spend $"+coffeePrice*coffeeAmount +" on coffee");
        System.out.println("Weekly, you spend $" +foodPrice*foodAmount + " on food");

    }
}
