public class DigitThread implements Runnable {
    private TaskQueue queue;
    private ResultTable results;

    public DigitThread(TaskQueue queue, ResultTable results) {
        this.queue = queue;
        this.results = results;
    }

    /**
     * Calculates digits of Pi from the task queue and stores the value in results table
     * Loops until the task queue is empty
     */
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

    /**
     * Gets the next digit from the task queue
     * @return The position of the next digit to compute
     */
    private int getTask() {
        synchronized (this.queue) {
            return this.queue.getNextNumber();
        }
    }

    /**
     * Stores a computed digit in the results table
     * @param key The position in the hash map to store the digit (given by the digits position)
     * @param value The value of the digit at that postion
     */
    private void storeDigit(int key, char value) {
        synchronized (this.results) {
            this.results.setValue(key,value);
        }

    }

    /**
     * @param n The digit of pi to be calculated
     * @return The value of that digit of pi
     */
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