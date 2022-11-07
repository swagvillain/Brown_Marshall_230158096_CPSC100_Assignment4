public class Brown_Marshall_Q2 {
    public static void main(String[] args) {

        //checking all numbers between 1 and 1000 if they are perfect numbers
        //printing any that are
        for(int i = 1; i <= 1000; i++){
            if(isPerfect(i))
                System.out.println(i);
        }
    }

    //this method checks if the input int is a 'perfect number'
    public static boolean isPerfect(int input){
        int sum = 0;
        for(int i = 1; i < input; i++){ //adding the factors of the input
            if(input%i == 0)
                sum += i;
        }

        return (sum == input);
        }
    }
