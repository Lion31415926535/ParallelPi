public class Assn3 {
    public static void main(String[] args) {
        TaskQueue queue = new TaskQueue();

        ResultTable results = new ResultTable();

        System.out.print("3.");
        for (int i=1; i<=100; i++) {
            System.out.print(getDigit(i));
        }
    }

    // Returns the nth digit of pi as a character
    public static char getDigit(int n) {
        Bpp calculateDigit = new Bpp();

        String digits = Integer.toString(calculateDigit.getDecimal(n));

        // Returns the first digit of the string
        if (digits.length() == 8) {
            return '0';
        } else {
            return digits.charAt(0);
        }

    }
}