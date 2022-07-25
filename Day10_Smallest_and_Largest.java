public class Smallest_and_Largest {

	public static void main(String[] args) {
		int[] arr = {70, 10, 99, 20, 2, 30, 56, 40};
		int s = arr.length;
		
		int sm=arr[0];
		int lg=arr[0];
		
		for( int i=0; i<s; ++i) {
			if(arr[i]>lg)
				lg=arr[i];
			if(arr[i]<sm)
				sm=arr[i];
		}
		System.out.println("Smallest: " + sm + "\nLargest: " + lg);
	}

}
