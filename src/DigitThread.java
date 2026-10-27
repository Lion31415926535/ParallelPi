public class DigitThread implements Runnable {
    private TaskQueue queue;
    private ResultTable results;

    public DigitThread(TaskQueue queue, ResultTable results) {
        this.queue = queue;
        this.results = results;
    }

    public void run() {
        while (true) {
            int task = getTask();
            if (task == -1) {
                break;
            }
            char digit = getDigit(task);

            storeDigit(task, digit);
        }
    }

    private int getTask() {
        synchronized (this.queue) {
            return this.queue.getNextNumber();
        }
    }

    private void storeDigit(int key, char value) {
        synchronized (this.results) {
            this.results.setValue(key,value);
        }

    }

    // Returns the nth digit of pi as a character
    private char getDigit(int n) {
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