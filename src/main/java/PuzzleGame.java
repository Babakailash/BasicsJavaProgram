import java.util.Random;
import java.util.Scanner;

public class PuzzleGame {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner sc = new Scanner(System.in);
        int number = generator.nextInt(100)+1; // strat with 1 so use +1
        int on_off = 1;
        while (on_off == 1){
            System.out.print("Enter any number between 1 to 100: ");
            int guess = sc.nextInt();

            if(guess < number){
                System.out.println("Too Low, try again");
            }
            if(guess> number){
                System.out.println("Too High, try again");
            }
            if(guess == number){
                System.out.println("Correct!!,Congratulation ! You Won");
                break;
            }
        }

    }
}
