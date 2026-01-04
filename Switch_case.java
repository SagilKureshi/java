import java.util.Scanner;
class Switch_case{
    public static void main(String[] args){
        System.out.print("Enter your Numbar : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        switch(n){

            case 1:
                System.out.println("your choice is 1");
                break;

            case 2:
                System.out.println("your choice is 2");
                break;

            case 3:
                System.out.println("your choice is 3");
                break;
            default:
                System.out.println("choice amoung 1-3");

        }
        s.close();
    }

}
