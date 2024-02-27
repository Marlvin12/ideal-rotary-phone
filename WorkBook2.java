import java.util.Scanner;

public class WorkBook2 {
    
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Hi Timmy! Choose   a number to count to : ");

        int x=scanner.nextInt();
        for(int i=0;i<=x;i++){
            System.out.print(i +" ");
    }
}
}
