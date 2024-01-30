public class boardMeeting {
    public static void main(String[] args){
        double sales =24309.65;
        double profit =18562.18;
        double refunds= 688.78;
        double shipping=1234.56;

        System.out.println("Sales: " + (int)sales);
        System.out.println("Profit: " + (int)profit);
        System.out.println("Refunds: " + (int)refunds);
        System.out.println("Shipping: " + (int)shipping);
        System.out.println("Total: " + (int)(sales+profit-refunds-shipping));
    }
    
}
