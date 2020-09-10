class java_prime {
	// Terrible solution, but a step by step idea
	// Can be made more efficient after this by combining functions
	
	
	// Make an array of all the factors up to a reasonable point...lol
	public static int [] get_factors(long numbah) {
		int [] factors = new int [10000];
		for (int i = 0; i < 10000; i++) {
			factors[i] = i;
		}
	
		for (int i = 2; i < 10000; i++) {
		
			if(numbah % i != 0) {
				factors[i] = 0;
			}
		}
		return factors;
	
	}

	//Check if numbers are prime or not.
	// Any non-prime number is set to 0
	// So now you have a huge array of mostly 0's and then the prime factors   >.<
	public static int [] check_if_prime(int [] factors) {
		for(int i = 2; i < 10000; i++) {
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					factors[i] = 0;
				}
			}
		}
		return factors;
	}

	// Iterate through array to find biggest one.
	public static int find_max(int [] factors, long numbah) {
		int max = 2;
		for (int i = 2; i < 10000; i++) {
			if(factors[i] > max && factors[i] < numbah) {
				max = factors[i];
			} 
		}
		return max;
	}



	public static void main(String[]args) {
		
		long numbah = 600851475143L;
		int [] factors = get_factors(numbah);
		check_if_prime(factors);
		int max = find_max(factors, numbah);
		System.out.println("max is: " + max);
		
	}



}