class Outer_Class{
	static int outer_s = 18;
	int outer_k = 07;
	private int outer_private = 77;
	class Inner_Class{
		void display(){
			System.out.println("outer_s = "+outer_s);
			System.out.println("outer_k = "+outer_k);
			System.out.println("outer_private = "+outer_private);
			
		}
	}
}
class Nested_Inner_Types{
	public static void main(String[] SK){
		Outer_Class outer_object = new Outer_Class();
		Outer_Class.Inner_Class inner_object = outer_object.new Inner_Class();
		inner_object.display();
	}
}