package Assignment07A;

public class MaxDigit {

    public static void main(String[] args) {
        int number = 8765546;
        int max = 0;
        int min = 9;

        while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit > max) {
                max = currentDigit;
            }

            if (currentDigit < min) {
                min = currentDigit;
            }

            number=number / 10;
        }

        System.out.println("The maximum digit is: " + max);
        System.out.println("The minimum digit is: " + min);
    }
}


