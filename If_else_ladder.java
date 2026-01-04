import java.util.Scanner;
class If_else_ladder{
    public static void main(String[] args){
        System.out.print("Enter Your Age : ");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if(age >0 && age <= 18){
            System.out.println("You can not vote");
        }
        else if(age > 18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("Please enter valid age");
        }
        s.close();
    }

}
