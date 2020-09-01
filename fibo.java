class fibo {

public static void main(String[] args) {

	
	int total = 0;
	int number = fib(6);
	
	System.out.println("number is: " + number);
	
	for(int i = 0; i< 10000; i++) {
		if (fib(i) % 2 == 0) {
			total += fib(i);
			if (fib(i) > 1000000) {
				System.out.println("breaking point is: " + fib(i));
				break;
			}
		}
	}
	
	System.out.println("total is: " + total);
	
	


}

public static int fib(int n) {
	if(n < 2) {
		return n;
	}
	else {
		return (fib(n-1) + fib(n-2));
	}

}


}