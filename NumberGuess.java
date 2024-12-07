import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random number=new Random();
        boolean play=true;
        int score=0;
        while(play){
            int target=number.nextInt(100)+1;
            int attempts=0;
            int maxattempts=10;
            boolean correct=false;
            System.out.println("A random number has been generated");
            System.out.println("You have 10 attempts to guess the number");
            while(attempts<maxattempts && !correct){
                System.out.print("Enter your guess:");
                int guess=input.nextInt();
                attempts++;
                if(guess==target){
                    System.out.println("You have guessed the correct number");
                    correct=true;
                    score=maxattempts-attempts+1;
                }
                else if(guess<target) System.out.println("Too low,try again!!");
                else System.out.println("Too high,try again!!");
                if(attempts==maxattempts && !correct) System.out.println("You have used all your attempts.The correct number was:"+target);
            }
            System.out.println("Your score:"+score);
            System.out.print("Would you like to play another round?(yes/no):");
            String response=input.next();
            if(!response.equalsIgnoreCase("yes")) play = false;
        }
        System.out.println("Thanks for playing.Your final score is: "+score);
    }
}
