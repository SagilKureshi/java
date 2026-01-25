interface SK{
	public void print();
}
class SK1 implements SK{
	public void print(){
		System.out.println("class SK1");
	}
}
class SK2 extends SK1{
	public void print(){
		System.out.println("class SK2");
	}
}
class Interface{
	public static void main(String[] SK){
		SK1 s1 = new SK1();
		s1.print();
		SK2 s2 = new SK2();
		s2.print();
	}
}