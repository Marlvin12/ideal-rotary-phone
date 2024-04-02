import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        //perfect when data is in  form of table 
        // int [][]grades=new int[3][4]; creating a new array
        
         int [][] grades={
            {72,74,78,76},
            {65,64,61,67},
            {95,98,99,100}
         };
         System.out.println(grades[1][2]);
         System.out.println(Arrays.toString(grades[2]));
         //updating the array
         grades[1][2]=7;
         System.out.println(Arrays.toString(grades[1]));
         grades[2][3]=99;
         System.out.println(Arrays.toString(grades[2]));

    }
    
}
