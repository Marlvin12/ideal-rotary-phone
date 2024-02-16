public class parameters {
    public static void main(String[] args) {
        calculateArea(6.0,6.6);
        calculateArea(4.0,3.1);
        calculateArea(9.0,6.6);
        
    }
    public static void calculateArea(double length,double width){
        double area=length*width;
        System.out.println("The area of a rectangle is "+area);

    }
}
