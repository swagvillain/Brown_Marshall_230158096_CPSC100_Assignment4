import java.util.Scanner;

public class Brown_Marshall_Q3 {
    public static void main(String[] args) {
        int input;
        float dailyRate = 1, medCharges, serviceCharges, days = 1;
        Scanner kbd = new Scanner(System.in);

        System.out.print("Was the patient:\n1) an in-patient? OR\n2) an out-patient?   ");
        input = kbd.nextInt();

        while(input != 1 && input != 2){
            System.out.println("Please enter either '1' or '2'");
            input = kbd.nextInt();
        }

        if(input == 1){
            days = userInput("You selected 1) an in-patient.\nPlease enter the number of days spent in hospital: ");
            dailyRate = userInput("Please enter the daily rate: $");
            }else{
            System.out.println("You selected 2) an out-patient.");
        }

        medCharges = userInput("Please enter the hospital medications charges: $");
        serviceCharges = userInput("Please enter the charges for hospital services: $");

        if(input == 1){
            System.out.printf("Your total charge is: $%.2f", totalCharge(medCharges, serviceCharges, days, dailyRate));
            }else{
            System.out.printf("Your total charge is: $%.2f", totalCharge(medCharges, serviceCharges));
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
        return(a+b+(c*d));
    }

    public static float totalCharge(float a, float b){
        return(a+b);
    }
}
/*
/usr/lib/jvm/java-1.11.0-openjdk-amd64/bin/java -javaagent:/opt/idea-IC-211.7628.21/lib/idea_rt.jar=35609:/opt/idea-IC-211.7628.21/bin -Dfile.encoding=UTF-8 -classpath /home/brownm6/Desktop/Marshall/CPSC100 Assignments/Brown_Marshall_230158096_CPSC100_Assignment4/out/production/Brown_Marshall_230158096_CPSC100_Assignment4 Brown_Marshall_Q3
Was the patient:
1) an in-patient? OR
2) an out-patient?   1
You selected 1) an in-patient.Please enter the number of days spent in hospital: 5
Please enter the daily rate: $100
Please enter the hospital medications charges: $45.60
Please enter the charges for hospital services: $54.40
Your total charge is: $600.00
Process finished with exit code 0
*/