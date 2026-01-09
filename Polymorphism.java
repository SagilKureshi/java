class Base{
	void print(){
		System.out.println("Base Class");
	}
}
class Child extends Base{
	void print(){
		System.out.println("Child Class");
	}
}
class Polymorphism{
		public static void main(String[] SK){
			Child obj =  new Child();
			obj.print();
		}
}