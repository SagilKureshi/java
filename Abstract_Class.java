abstract class Book{
	//Abstract method without body
	public abstract void page();
}
class Abstract_Class extends Book{
	//Declaring the abstract method 
	public void page(){
		System.out.println("OLD");
	}
	public static void main(String SK[]){
		Book obj = new Abstract_Class();
		obj.page();
	}
}