import java.util.Scanner;

public class trivia {
    
    public static void main(String[] args) {
        int total=4;
        int count=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String ans1=scan.nextLine();
        switch (ans1) {
            case "a":
                count=0;   
                break;
            case "b":
                count=0;   
                break;
            case "c":
                count+=1;   
                break;
            case "d":
                count=0;   
                break;
            default:
                break;
        }
        scan.nextLine();
    System.out.println("2. Which planet is the hottest?");
    System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
    String ans2=scan.nextLine();
    switch (ans2) {
        case "a":
            count+=1;   
            break;
        case "b":
            count=0;   
            break;
        case "c":
            count=0;   
            break;
        case "d":
            count=0;   
            break;
        default:
            break;
    }

    scan.nextLine();
    System.out.println("1. Which is the rarest blood type?");
    System.out.println("\ta) O\n\tb) A\n\tc) Bl\n\td) AB-Negative\n");
    String ans3=scan.nextLine();
    switch (ans3) {
        case "a":
            count=0;   
            break;
        case "b":
            count=0;   
            break;
        case "c":
            count=0;   
            break;
        case "d":
            count+=1;   
            break;
        default:
            break;
    }
    scan.nextLine();
    System.out.println("1. Which country held the 2016 Summer Olympics?");
    System.out.println("\ta) Ron Weasley\n\tb) Herminone Granger\n\tc) Draco Malfoy\n)");
    String ans4=scan.nextLine();
    switch (ans4) {
        case "a":
            count+=1;   
            break;
        case "b":
            count=0;   
            break;
        case "c":
            count=0;   
            break;
        case "d":
            count=0;   
            break;
        default:
            break;
    }
 

    System.out.println("1. You final score is"+(count+"/"+total));
    System.out.println("Wow, you know your stuff!");
   
 scan.close();
    }
    
}
