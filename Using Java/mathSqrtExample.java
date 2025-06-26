import java.util.Scanner;

class mathSqrtExample {
    public static int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();  // Fixed: you need to store the input in a variable

        double result = mySqrt(x);  // Fixed: call static method properly
        System.out.println("Square root of " + x + " is: " + result);

        sc.close();
    }
}
