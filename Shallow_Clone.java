class glass{
	int s,k;
	public String toString(){
		return "glass s == "+s+"  fun1 k == "+k;
	}
}
class Shallow_Close{
	public static void main(String[] SK){
		glass o1 = new glass();//Object
		o1.s = 7;
		o1.k = 2;
		glass o2 = o1;//Reference
		o2.k = 9;
		System.out.println(o1);
		System.out.println(o2);
	}
}