import java.util.Scanner;
import java.util.Random;
class Guess_game{
    public static void main(String[] args){
        Random r = new Random();
        int g = r.nextInt(100);
        int guesses = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Guess a Number between 1-100 :- ");
        System.out.println("Enter -1 to exit");
       
        while(true){
        System.out.print("Your Number : ");
        int n = s.nextInt();
            if(n==-1){
                System.out.println("Exite from Game");
                break;
            }
            else if(n>g){
                guesses++;
                System.out.println("Guess small Number");
        
            }
            else if(n<g){
                guesses++;
                System.out.println("Guess Big Number");
        
            }
            else{
                guesses++;
                System.out.println("Congratulations!...\nYou Guess Right Number : " + n);
                System.out.print("Total Number of Guesses : " + guesses);
                break;
            }
        }
    }
}

