import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {

        double[] original_prices={ 1.99,2.99,3.99,4.99};

        System.out.println(Arrays.toString(original_prices));
         double[] new_prices = new double[4];
        for(int i=0;i<original_prices.length;i++)
         new_prices[i]=original_prices[i]+0.13*original_prices[i];
         System.out.println(Arrays.toString(new_prices));
    }
       
    
}
