class glass{
	int s,k;
	public String toString(){
		return "glass s == "+s+"  glass k == "+k;
	}
}
class Deep_Clone{
	public static void main(String[] SK){
		glass o1 = new glass();
		o1.s = 4;
		o1.k = 3;
		glass o2 = new glass();
		o2.s = o1.s;
		o2.k = o1.k;
		System.out.println(o1);
		System.out.println(o2);
	}
}