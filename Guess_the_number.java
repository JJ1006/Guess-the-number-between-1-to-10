
import java.util.Random;
import java.util.Scanner;

class Guess_the_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please guess the number between 1 to 10 : ");
        int number = sc.nextInt();

        Random random = new Random();
        int rannum = random.nextInt(11);

      
        while(true);{
            try{
                System.out.println("\nPlease enter the guessed number : ");
            } 
            if(number>rannum){
                System.out.println("The actual number is smaller than this!");
            }
            else if(number<rannum){
                System.out.println("The actual number is greater than this!");
            }

            else{
                System.out.println("You have guessed the number correctly");
            }
        }
        sc.close();
}
}

