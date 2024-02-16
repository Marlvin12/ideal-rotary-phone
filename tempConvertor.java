public class tempConvertor {
/**
 * Function: calls the  fehrenheitToCelsius and prints the return value
 * @param double:celcius
 * @param args
 */
    public static void main(String[] args) {
        double celcius=fehrenheitToCelsius(33);
        System.out.println("The temperature is: "+celcius+" degrees"); 
        
    }
    /**
     * Function: changes fehrenheits to Celcius
     * @param double: fehrenheit
     * @return
     */
    public static double fehrenheitToCelsius(double fahrenheit){
        double degrees=(fahrenheit-32)/1.8;
       return degrees;
    }
}
