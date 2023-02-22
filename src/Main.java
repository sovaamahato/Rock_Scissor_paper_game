import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //take user input S,P,R
        System.out.println("\t----------------------------------------------");
        System.out.println("\t\t\tWelcome to the Game!!1");
        System.out.println("\t----------------------------------------------");
        Scanner inputobj=new Scanner(System.in);
        System.out.println("");
        System.out.println("\tPlease enter S for scissor, P for paper,R for Rock");
        char userMove =inputobj.next().charAt(0);
        System.out.println("\tyou entered>> "+userMove);

        //computer generate input S,P,R
        char[] maxMove ={'S','P','R'};

        Random random =new Random();
        int number =random.nextInt( 3);

        char computerMove = maxMove[number];
        System.out.println("\tcomputer gives>>> "+computerMove);
        System.out.println("\t----------------------------------------------");


        //if else
                    //
        if(computerMove==userMove)
        {
            System.out.println("\toops!game Draw");
        }
        else if(computerMove=='S'&& (userMove=='P'||userMove=='R')){
            if(computerMove=='S'&& userMove=='P')
            {
                System.out.println("\tcomputer wins");
            }
            else {

                System.out.println("\tcongratulations!!!You win");

            }

        }
        else if(userMove=='S'&& (computerMove=='P'||computerMove=='R'))
        {
            if(userMove=='S'&& computerMove=='P')
            {
                System.out.println("\tyou win");
            }
            else {

                System.out.println("\tcomputer  wins");

            }

        }
        else {
            System.out.println("\tSomething went wrong or you entered small letter");
        }



    }
}