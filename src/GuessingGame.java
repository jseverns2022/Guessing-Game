/* DO NOT CHANGE THE HEADER*/
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args){
        /* DO NOT CHANGE */
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int answer = rand.nextInt(100)+1; //Randomly generated answer
        int upperBound = 100; //upper bound for user guidance
        int lowerBound = 1; // lower bound for user guidance
        System.out.println("Please enter your guess "+lowerBound+" - "+upperBound);
        int userInput = scan.nextInt(); // getting user input from console
        int numOfTrial = 1; // number of time user used

        /* TODO:
            Please go ahead and fill in the condition of the while
            it definitely is not true, fill in the code so that it does
            the following things:
            1. tells user if his/her guess is wrong
            2. tell user if his/her guess is too big/small
            3. tell user to enter his/her guess in new range
            eg: answer -> 30 user enters -> 23
            you should print:
                "You got the wrong answer"
                "Your answer is too small"
                "Please enter you guess in the range from 24-100"
                "This is your 1 try"
                answer -> 30 user enters -> 40
             you should print:
                "You got the wrong answer"
                "Your answer is too big"
                "Please enter you guess in the range from 24-39"
                "This is your 2 try"
                answer -> 30 user enters -> 30
             you should print:
                "Congrats, you got the answer with 3 attempt"
         */

        //TODO YOUR CODE STARTS HERE
        while(answer!=userInput){
        int x = answer;
        numOfTrial++;

            if (x > userInput) {
                System.out.println("You got the wrong answer");
                System.out.println("Your answer is too small");
                System.out.println("Please enter your guess in the range from "  + userInput + "-" + upperBound);
                System.out.println("This is your " + numOfTrial + " try");
                lowerBound = userInput;

            } else  {
                System.out.println("You got the wrong answer");
                System.out.println("Your answer is too big");
                System.out.println("Please enter your guess in the range from " + lowerBound + "-" + userInput);
                System.out.println("This is your " + numOfTrial + " try");
                upperBound = userInput;
            }


            userInput = scan.nextInt();
        }
        System.out.println("Congrats, you got the answer with " + numOfTrial + " attempts");
    }
}

//System,out.print("try"++);