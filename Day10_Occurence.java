public class occurence {

	public static void main(String[] args) {
		String str="Mississipi";
		char o='s';
		int c=0;
		
		int l= str.length();
		
		for (int i =0; i< l; ++i) {
			char d= str.charAt(i);
			if (d == o)
				++c;
		}
		System.out.println("Occurence: " + c);
	}

}
