import java.util.Scanner;

public class Brown_Marshall_Q3 {
    public static void main(String[] args) {
        int input = 0;
        float dailyRate = 1, medCharges, serviceCharges, days = 1;
        Scanner kbd = new Scanner(System.in);

        System.out.println("Was the patient an:\n1) in-patient? \n2) out-patient?");
        input = kbd.nextInt();

        while(input != 1 && input != 2){
            System.out.println("Please enter either '1' or '2'");
            input = kbd.nextInt();
        }

        if(input == 1){
            days = userInput("Please enter the number of days spent in hospital: ");
            dailyRate = userInput("Please enter the daily rate: $");
            }
        medCharges = userInput("Please enter the hospital medications charges: $");
        serviceCharges = userInput("Please enter the charges for hospital services: $");

        if(input ==1){
            totalCharge(medCharges, serviceCharges, days, dailyRate);
        }else{
            totalCharge(medCharges, serviceCharges);
        }
    }

    public static float userInput(String prompt){
        float input;
        Scanner kbd = new Scanner(System.in);
        do {
            System.out.print(prompt);
            input = kbd.nextFloat();
        }while(input<0);
        return input;
    }

    public static float totalCharge(float a, float b, float c, float d){
//        medCharges = userInput("Please enter the hospital medications charges: $");
//        serviceCharges = userInput("Please enter the charges for hospital services: $");
//        days = userInput("Please enter the number of days spent in hospital: ");
//        dailyRate = userInput("Please enter the daily rate: $");
        return(a+b+(c*d));
    }

    public static float totalCharge(float a, float b){
        return(a+b);
    }

}
