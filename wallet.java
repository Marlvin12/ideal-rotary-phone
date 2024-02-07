import java .util.Scanner;

public class wallet {

    public static void main(String[] args) {
        
        double rice =12.00;
        double beans = 5.00;
        double milk = 3.00;
        double total=rice+beans+milk;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Java Store");

        System.out.println("How much money do you have?");
        double balance=scanner.nextDouble();

        //Asking if i can buy certain items
        System.out.println("Can I buy rice?");
        if(balance>=rice){
            System.out.println("Yes, you can buy rice");
            balance-=rice;
        }else{
            System.out.println("No, you cannot buy rice");
        }
        System.out.println("Can i buy beans,rice and milk?");
        if(balance>=total){
            System.out.println("Yes, you can buy beans, rice and milk");
            balance-=total;
        }else{
            System.out.println("No, you cannot buy beans, rice and milk");

        }
scanner.close();
        System.out.println("You have "+balance+" left in your wallet"); 



    
    
}
}
