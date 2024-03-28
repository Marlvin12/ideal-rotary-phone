
import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu={"Espresso","Iced Coffee","Macchiato"};
        menu[2]="Coolade";
        String menuString=Arrays.toString(menu);
        System.out.println(menuString);

    //Changing the length  of the array
    String[] newMenu = new String[5];
    for(int i=0;i<menu.length;i++){
        newMenu[i]=menu[i];
    }
    newMenu[3]="coolade";
    newMenu[4]="milk";
    System.out.println(Arrays.toString(newMenu));
    }
    
}
