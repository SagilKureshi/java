package animals;
public class UDF_Package{
	public void eat(){
		System.out.println("Mammal eats");
	}
	public void travel(){
		System.out.println("Mammal Travels");
	}
	public static void main(String SK[]){
		UDF_Package o = new UDF_Package();
		o.eat();
		o.travel();
	}
}
