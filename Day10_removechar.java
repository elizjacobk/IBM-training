public class Remove_char {

	public static void main(String[] args) {
		String str="The quick brown fox", nstr="";
		char c='o';
		
		int l= str.length();
		
		for (int i =0; i< l; ++i) {
			char d= str.charAt(i);
			if (d == c)
				continue;
			else
				nstr=nstr+d;
		}
		System.out.println("New String: " + nstr);
		
	}

}
