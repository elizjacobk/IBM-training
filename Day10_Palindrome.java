public class Palindrome {

	public static void main(String[] args) {
		String str = "bloop", rstr = "";
	    
	    int l = str.length();

	    for (int i = (l - 1); i >=0; --i) {
	      rstr = rstr + str.charAt(i);
	    }

	    if (str.equals(rstr)) {
	      System.out.println("Palindrome String.");
	    }
	    else {
	      System.out.println("Not a Palindrome String.");
	    }
	}

}
