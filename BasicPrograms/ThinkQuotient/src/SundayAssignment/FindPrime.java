package SundayAssignment;

/*
 * java program to find prime 
 * numbers in given digit.   for eg  456789  o/p   7 5
 */
public class FindPrime {
    public static void main(String[] args) {
        int n = 456789;

        while (n > 0) {
            int digit = n % 10;

            boolean prime = true;
            if (digit < 2) {
                prime = false;
            } else {
                for (int i = 2; i*i <= digit; i++) {
                    if (digit % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime) {
                System.out.println(digit);
            }

            n /= 10;
        }
    }
}

