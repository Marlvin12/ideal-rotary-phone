import java.util.Scanner;

public class WorkBook5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("I  hear you can count");

        System.out.println("Pick a number to count by: ");
        int x=scanner.nextInt();

        System.out.println("Pick a number to start  counting from: ");
        int y=scanner.nextInt();

        System.out.println("Pick a number to count to: ");
        int z=scanner.nextInt();

        for(int i=y; i <= z;i+=x){
            System.out.print(i + " ");

        }

    }
}
