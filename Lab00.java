public class Lab00 {
	public static void main(String[] args) {
   		// declaring and initializing some variables
   		int x = 5;
   		String y = "hello";
   		double z = 9.8;

   		// printing the variables
   		System.out.printf("x: %d y: %s z: %.1f%n", x, y, z);
   		
   		// an array
   		int[] nums = {3,6,-1,2};
   		for (int val : nums)
   			System.out.printf("%d%n", val);

   		// call a function
   		int numFound = charCount(y, 'l');

   		System.out.printf("Found: %d%n", numFound);

   		// a counting for loop
   		for (int i = 1; i < 11; i++) {
   			System.out.printf("%d ", i);
   		}

   		System.out.printf("%n");
	}

	public static int charCount(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
}