class Scratch {

	static int a; 		// prints 0
	static String s1;	// prints null

	public static void main(String[] args) {
		int b;
		System.out.println(a);
//		System.out.println(b); // won't compile

		String s2;

		System.out.println(s1);
//		System.out.println(s2); // won;'t compile

	}
}
