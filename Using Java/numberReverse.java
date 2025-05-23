class numberReverse{
    public static int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            int digit = x % 10;

            // Check for overflow
            if (reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10) {
                return 0;
            }

            reverse = reverse * 10 + digit;
            x /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int x = 321456;
        int result = reverse(x);
        System.out.println("Reverse Number Is: " + result);
    }
}
