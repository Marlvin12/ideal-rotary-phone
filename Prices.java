import java.util.Arrays;

public class Prices {
    public static void main(String[] args) {
        double [][]prices={
            {12.99, 8.99, 10.49, 11.99},
            {0.99,1.99,2.49,1.49,2.99},
            {8.99,7.99,9.49,9.99,10.99}
        };

        System.out.println("Baking: "+Arrays.toString(prices[0]));
        System.out.println("Beverage: "+Arrays.toString(prices[1]));
        System.out.println("Cereals: "+Arrays.toString(prices[2]));
        double [][]grades={
        {12.00, 8.00, 10.00, 11.00},
        {0.99,5.00,2.00,7.00,3.00},
        {8.00,7.00,9.00,9.00,10.00}
    };
    for(int j=0 ;j<grades[0].length; j++){
        System.out.println(grades[0][j]);
    }
    for(int j =0; j<grades.length;j++){
        System.out.println(grades[1][j]);
    } 
    //instead of every loop you create a nested loop
    //the outer loop runs through every row(i)
    //the inner loop runs through every item in that row
    for(int i=0; i<grades.length;i++){
        for(int j=0;j<grades[i].length;j++){
            System.err.println(grades[i][j]);
        }
    }
    }
}
