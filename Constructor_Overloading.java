class Constructor_Overloading{
	Constructor_Overloading(){
		System.out.println("Defalt Constructor/Constructor without Arguments");
	}
	Constructor_Overloading(int s){
		System.out.println("Value of s = "+s);
	}
	Constructor_Overloading(int s,int k){
		System.out.println("s = "+s+"\nk = "+k);
	}
	public static void main(String[] SK){
		Constructor_Overloading obj1 = new  Constructor_Overloading();
		Constructor_Overloading obj2 = new  Constructor_Overloading(99);
		Constructor_Overloading obj3 = new  Constructor_Overloading(99,199);
	}
}