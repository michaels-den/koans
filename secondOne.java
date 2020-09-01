class secondOne {


    public static void main(String[]args) {
        int total = 0;
        for (int i= 0; i < 1000; i++) {
        if(i % 3 == 0 || i % 5 == 0) {
            total += i;
        }
        }

        System.out.println("sum of all multiples of 3 and 5: " + total);


    }



}
