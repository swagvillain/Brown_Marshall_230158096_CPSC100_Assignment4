import java.util.Scanner;

public class Brown_Marshall_Q1 {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        float input = 101;

        //taking user input and validating
        System.out.print("Please enter your average: ");
        input = kbd.nextFloat();
        while(input>100){
            System.out.print("Please enter a valid average from 0-100:");
            input = kbd.nextFloat();
        }

        System.out.println(qualityPoints(input));
    }

    public static int qualityPoints(float input){
        int newInt = (int) input;
        newInt = newInt/10;
        switch(newInt){
            case (10):
            case (9):   return 4;
            case (8):   return 3;
            case (7):   return 2;
            case (6):   return 1;
            default: return 0;
        }

    }
}
