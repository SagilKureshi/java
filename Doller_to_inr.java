import java.util.Scanner;
class Doller_to_inr{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter USA Dollar = ");
        double USA_CUR = s.nextDouble();
        double IND_CUR = USA_CUR * 89.63;
        System.out.println("Indiam Rupees = " + IND_CUR);
        s.close();
        }

}
