public class WhileLoops {

    public static void main(String[] args) {
        // Example 1: Roll a dice until a 6 is rolled
        // TODO: Write a while loop that simulates rolling a dice until a 6 is rolled
       int diceRoll=  -1;
        while(diceRoll !=6 ){
            diceRoll=rollDice();
            System.out.println(diceRoll);

        }

        // Example 2: Generate random numbers between 1 and 100 until a number greater than 90 is generated
        // TODO: Write a while loop that generates random numbers between 1 and 100 until a number greater than 90 is generated
         int numberRandom=-1;
         while(numberRandom<90){
            numberRandom=generateRandomNumber();
            System.out.println(numberRandom);
         }


        // Example 3: Keep doubling a random number until it's greater than 1000
        // TODO: Write a while loop that keeps doubling the 'number' variable until it's greater than 1000
        int numberDouble=generateRandomNumber();
        while(numberDouble<1000){
            numberDouble=numberDouble*2;
            System.out.println(numberDouble);
        }
    }

    // Function to simulate rolling a dice (returns a random integer between 1 and 6)
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    // Function to generate a random integer between 1 and 100
    public static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }

}
