package Assignment15K;

public class StaticOverloading {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result1 = StaticOverloading.add(2, 4);
        int result2 = StaticOverloading.add(2, 4, 6);
        double result3 = StaticOverloading.add(3.5, 5.6);

        System.out.println("RESULT1: " + result1);
        System.out.println("Result2: " + result2);
        System.out.println("Result3: " + result3);
    }
}
