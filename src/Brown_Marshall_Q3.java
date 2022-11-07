import java.util.Scanner;

public class Brown_Marshall_Q3 {
    public static void main(String[] args) {
        int days = 0;
        int input = 0;
        float dailyRate, medCharges, serviceCharges;
        Scanner kbd = new Scanner(System.in);

        System.out.println("Was the patient an:\n1) in-patient? \n2) out-patient?");
        input = kbd.nextInt();

        while(input != 1 && input != 2){
            System.out.println("Please enter either '1' or '2'");
            input = kbd.nextInt();
        }

        if(input == 1) {
            System.out.print("Please enter the number of days spent in hospital: ");
            dailyRate = kbd.nextInt();
            while(days < 0) {
                System.out.println("please enter a valid input: ");
                days = kbd.nextInt();
            }

            //figure out user input validation using method? ie userInput(String prompt)??

            System.out.print("Please enter the daily rate:");
        }
        }
}
