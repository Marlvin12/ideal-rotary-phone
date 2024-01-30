public class StudyJava {
// This program calculates the amount of pay that will be contributed to a retirement plan if 5%, 8%, or 10% of monthly pay is withheld.
    public static void main (JoiningStrings[] args) {
         
        double monthlyPay = 6000.0;
        double contribution;
        double contribution2;
        double contribution3;
        double result;
        
        
        //calculate and display 5% contribution
        contribution= monthlyPay * 0.05;
        System.out.println("5 percent is $" + contribution + " per month.");

        //calculate and display 8% contribution- 10% tax
        contribution2=monthlyPay-(monthlyPay * 0.10);
        contribution3=contribution2 * 0.08;
        System.out.println("8 percent is $-Tax is " + contribution3 + " per month.");

        result=Math.pow(2.0, 2.0);
        System.out.println("2 to the power of 2 is " + result);
       
    }
}
