import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's the weather like?");
        String weather = scanner.nextLine();  
        if (weather=="sunny"){
            System.out.println("It's a nice day for a walk.");
        }else if(weather=="rainy"){
         System.out.println("Bring an umbrella!");}
         else if(weather=="snowy"){
             System.out.println("Wear a coat and a hat.");
            }else{
        System.out.println("Not sure what to do in this weather.");
    }

        System.out.println("What's your score?");
        int score=scanner.nextInt();
        if (score>=80){
            System.out.println("You got an A!");
        }
        else if(score>=70){
            System.out.println("You got a B!");
        }
        else if(score>=60){
            System.out.println("You got a C.");
        }
        else if(score>=50){
            System.out.println("You got a D.");
        }
        else{
            System.out.println("You failed :(");
        }

//next Linetrap
        scanner.nextLine();
        System.out.println("What's your job title?");
        String jobTitle = scanner.nextLine();
        if(jobTitle=="CE0"){
            System.out.println("You're the boss!");
        }
        else if(jobTitle=="manager"){
            System.out.println("You're in charge of a team.");
        }
        else{
            System.out.println("You're an employee.");
        }

        System.out.println("What's your grade?");
        char grade = scanner.next().charAt(0);
        if (grade=='A'){
            System.out.println("Excellent work!");
        }
        else if(grade=='B'){
            System.out.println("Good job!");
        }
        else if(grade=='C'){
            System.out.println("You did okay.");
        }
        else if(grade=='D'){
            System.out.println("Hey, you still passed!");
        }
        else{
            System.out.println("You failed :(");
        }        

        scanner.close();
    }
}
