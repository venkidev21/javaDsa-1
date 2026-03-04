package dsa;

public class shdow {
	static int  x=10;
	public static void main(String[] args) {
		System.out.println(x);
		int x=70;
		System.out.println(x);
		fu();
	}
	static void fu() {
		System.out.println(x);
	}

}
