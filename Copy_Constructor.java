class Copy_Constructor{
	private String name;
	private int age;
	Copy_Constructor(String name,int age){
		this.name = name;
		this.age = age;
	}
	Copy_Constructor(Copy_Constructor obj){
		this.name = obj.name;
		this.age = obj.age;
	}
	public void display(){
		System.out.println("Name : "+name+"\nAge : "+age);
	}
	public static void main(String[] SK){
		Copy_Constructor obj1 = new Copy_Constructor("Sagil",18);
		Copy_Constructor obj2 = new Copy_Constructor(obj1);
		obj2.display();
	}
}