import java.util.Scanner;
class User_input{
		public static void main(String[] args){
			Scanner s = new Scanner(System.in);
			System.out.print("Enter Name : ");
			String str = s.nextLine();
			System.out.print("Enter Age :");
			int i = s.nextInt();
			s.close();
		}
}