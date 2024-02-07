public class Comparisons {

    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
        if (biologyGrade>chemistryGrade){
            System.out.println("Java: Yes, you scored better in biology");
        } else {
            System.out.println("Java: No, you did not score better in biology");
        }

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");
        if(sales>costs){
            System.out.println("Java: Yes, we made money");
        }
        else{
            System.out.println("Java: No, we did not make money");
        }
    

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
        if(temperature<targetTemperature){
            System.out.println("Java: Yes, the temperature is colder than our target");
        }
        else{
            System.out.println("Java: No, the temperature is not colder than our target");
        }

        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        if(currentSpeed<speedLimit){
            System.out.println("Java: Yes, you are driving slower than the speed limit");
        }
        else{
            System.out.println("Java: No, you are not driving slower than the speed limit");
        }

        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
        if(age>retirementAge){
            System.out.println("Java: Yes, you are old enough to retire");
        }
        else{
            System.out.println("Java: No, you are not old enough to retire");
        }

        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
       if(myGrade==bestGrade){
              System.out.println("Java: Yes, you got the best possible grade");
       }else{
                System.out.println("Java: No, you did not get the best possible grade");
         }
    
            int phoneNumber = 5551234;
            int contactNumber = 5551234;
            System.out.println("Me: Hi Java, is this the correct phone number for my contact?");
            if(phoneNumber==contactNumber){
                System.out.println("Java: Yes, this is the correct phone number for your contact");
            }
            else{
                System.out.println("Java: No, this is not the correct phone number for your contact");
            }
    
            char letter1 = 'a';
            char letter2 = 'b';
            System.out.println("Me: Hi Java, are these two letters different?");
            if(letter1!=letter2){
                System.out.println("Java: Yes, these two letters are different");
            }
            else{
                System.out.println("Java: No, these two letters are not different");
            }
    
            long distance1 = 1000L;
            long distance2 = 500L;
            System.out.println("Me: Hi Java, are these two distances not equal?");
            if(distance1!=distance2){
                System.out.println("Java: Yes, these two distances are not equal");
            }
            else{
                System.out.println("Java: No, these two distances are equal");
       }

        String word = "hello";
        String secondWord = "hello";
        System.out.println("Me: Are the two words the same?");
        if(word.equals(secondWord)){
            System.out.println("Java: Yes, the two words are the same");
        }
        else{
            System.out.println("Java: No, the two words are not the same");
        }

        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("Me: Are the two words different");
        if(!thirdWord.equals(fourthWord)){
            System.out.println("Java: Yes, the two words are different");
        }
        else{
            System.out.println("Java: No, the two words are not different");
        }
    }
}
