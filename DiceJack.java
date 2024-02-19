import java.util.Scanner;

public class DiceJack {
    
    public static void main(String[] args) {
        int roll1=rollDice();
        int roll2=rollDice();
        int roll3=rollDice();
        int sumRollDice=roll1+roll2+roll3;

    //pick three numbers:
    Scanner scanner = new Scanner(System.in);
    System.out.println("Choosee any number between 0-6");
    int x =scanner.nextInt();
  
    System.out.println("Choosee again a number between 0-6");
    int y =scanner.nextInt();
  
    System.out.println("Choosee any number between 0-6");
    int z =scanner.nextInt();
    
    if (sumRollDice<sum(x,y,z) & sumRollDice-sum(x, y, z)<3){
        System.out.println("YOU WON!!");
    }
    else{
        System.out.println("You lose Try again");
    }
        
    }
    public static int rollDice(){
                                //random number between 0-0.9999
        double randonNumber=(Math.random()*6);
        randonNumber+=1;//between 0-6.999999
         return (int)(randonNumber);//between 0-6
    }
    public static int  sum(int x, int y,int z){
       int total=x+y+z;
        return total;
    }
}
