package animals.domestic;
public class Sub_Package{
	public void eat(){
		System.out.println("Mammal eats");
	}
	public void travel(){
		System.out.println("Mammal travel");
	}
	public static void main(String SK[]){
		Sub_Package m = new Sub_Package();
		m.eat();
		m.travel();
	}
}