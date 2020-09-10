import java.util.ArrayList;
import java.util.List;


//  This one is wrong because it double-counts multiples of both 3 and 5***
class firstOne {
    public static void main(String[] args) {

        List<Integer> threes = new ArrayList<>();
        List<Integer> fives = new ArrayList<>();

        int threeMults = getThrees(threes);
        int fiveMults = getFives(fives);

        System.out.println("The sum of all the multiples of threes is: " + threeMults);
        System.out.println("The sum of all the multiples of threes is: " + fiveMults);

        System.out.println("The sum of all the multiples of 3 or 5 below 1000 is: " + (threeMults + fiveMults));
    }

    public static int getThrees(List<Integer> list) {
        int total = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0) {
                list.add(i);
            }
        }
        for (Integer integer : list) {
            total += integer;
        }
        return total;
    }

    public static int getFives(List<Integer> list) {
        int total = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 5 == 0) {
                list.add(i);
            }
        }
        for (Integer integer : list) {
            total += integer;
        }
        return total;
    }
}
     
