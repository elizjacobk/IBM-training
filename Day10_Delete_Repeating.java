public class Delete_Repeating {

	public static void main(String[] args) {
		String str="Mississipi", nstr="";
		int c=0;
		
		int l= str.length();
		
		for (int i =0; i< l; ++i) {
			char d= str.charAt(i);
			int len= nstr.length();
			for(int j =0; j<len; ++j) {
				char e= nstr.charAt(j);
				if (d==e)
					++c;
			}
			if (c==0)
				nstr=nstr+d;
			c=0;
		}
		System.out.println("New String: " + nstr);
	}

}
