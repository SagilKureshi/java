import java.util.Scanner;
import java.util.Random;
class Guess_game{
    public static void main(String[] args){
        Random r = new Random();
        int rn = r.nextInt(100);
        int guesses = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Guess a Number between 1-100 :- ");
        System.out.println("Guess Number in Maximum 10 attempts :-");
        System.out.println("Enter -1 to exit");
       
        while(guesses<=10){
        System.out.print("Your Number : ");
        int gn = s.nextInt();
            if(gn==-1){
                System.out.println("Exite from Game");
                break;
            }
            if(guesses>=10){
                System.out.println("Nice try,\n10 attemps completed,\nBatter Luck Nexttime");
                System.out.println("Answers = "+rn);
                break; 
            }
            else if(gn>rn){
                guesses++;
                System.out.println(guesses+" - Attempts\n"+"Guess small Number");
        
            }
            else if(gn<rn){
                guesses++;
                System.out.println(guesses+" - Attempts\n"+"Guess Big Number");
        
            }
            else{
                guesses++;
                System.out.println(guesses+" - Attempts\n"+"Congratulations!...\nYou Guess Right Number : " + gn);
                System.out.print("Total Number of Guesses : " + guesses);
                break;
            }
        }
    }
}




