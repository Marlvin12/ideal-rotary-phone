public class returnValues {
        public static void main(String[] args) {
            
            double area1=calculateArea(9.0,6.6);
        printArea(9.0,6.6,area1);
          


            String spanishExplanation=explainArea("Spanish");
            System.out.println("Spanish explanation is : "+ spanishExplanation);
            
        }
        public static double calculateArea(double length,double width){
            if(length<0|| width<0){
                System.out.println("INVALID DIMENSIONS");
                System.exit(0);
            }
            double area=length*width;
            return area;
    
        }


        public static String explainArea(String language){
            switch (language) {
                case "English":
                    return "Area equals length * width";
                case "French":
                    return "La surface est egale a la longueur * la largeur";
                case "Spanish":
                    return "area es igual a largo * ancho";
            
                default:
                   return"Language not available";
            }
        }
        public static void printArea(double length, double width,double area){
            System.out.println("A rectangle width length: "+length+" the width is: "+width+"the area is: "+area);
        }

//English "Area equals length * width"

//French "La surface est egale a la longueur * la largeur"

//Spanish "area es igual a largo * ancho"
    }
    

