public class SwitchStatements {
    public static void main(String[] args) {
        String weather="snowy";
        switch (weather) {
            case "sunny":System.out.println("You can wear a Tshirt");
            break;
            case "cloudy":System.out.println("You can wear a sweater");
            break;
            case "windy":System.out.println("You can wear a  Wind-Breaker");
            break;
            case "rainy":System.out.println("You can wear a raincoat");
            break;
            case "snowy":System.out.println("You can wear a jacket");
            break;     
            default:System.out.println("You can wear whatever you want");

                break;
        }

        // Determine what to wear based on the weather (e.g., sunny, cloudy, rainy, snowy)
        // Decide whether to use if-else or switch

        // Section 2: User role
        int role = 2;
        switch (role) {
            case 1:System.out.println("you are admin");
            break;
            case 2:System.out.println("you are an editor");
            break;
            case 3:System.out.println("you are a user"); 
            break;
            default:System.out.println("you are a not registered"); 
                break;
        }
        // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3: user)
        // Decide whether to use if-else or switch

        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;
        if(temperature==75 && humidity==65){
            System.out.println("The weather is comfortable");
        }else if (temperature<75 && humidity<65) {
            System.out.println("The weather is comfortable");
        } else {
            System.out.println("The weather is Hot");
        }
        // Determine the comfort level based on both temperature and humidity (e.g., too hot, too cold, comfortable)
        // Decide whether to use if-else or switch

        // Section 5: Age and income
        int age = 25;
        int income = 50000;
        if(age==25 && income == 50000){
            System.out.println("You are eligible for a credit card");
        }else{
            System.out.println("You are not eligible for a credit card");
        }
                // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch

        // Section 1: Traffic light colors
        String lightColor = "green";
        switch (lightColor) {
            case "green":System.out.println("Go");
            break;
            case "yellow":System.out.println("reduce speed");
            break;
            case "red":System.out.println("stop");
            break;
            default:System.out.println("wait till all cars pass");
            break;
        }
        // Determine what action to take based on the traffic light color (e.g., green, yellow, red)
        // Decide whether to use if-else or switch

        // Section 2: Exam grade
        int grade = 85;
        if(grade>=90){
            System.out.println("A");
        }else if (grade>=80) {
            System.out.println("B");
        } else if(grade>=70) {
            System.out.println("C");
        } else if(grade>=60) {
            System.out.println("D"); 
        }else{
            System.out.println("F");
        }    
        
    
        // Section 3: Browser type
        String browser = "Chrome";
        switch (browser) {
            case "Firefox":System.out.println("Firefox browser used");
            break;
            case "Safari":System.out.println("Safari browser used");
            break;
            case "Edge":System.out.println("Edge Browser used");
            break;
            case "Opera":System.out.println("Opera Browser used");
            break;
            default:System.out.println("UnIdentified Browser");
            break;
        }
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge, or Opera
        // Decide whether to use if-else or switch
        
        

    }
}
