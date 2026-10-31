public class Assn3 {
    public static void main(String[] args) {
        // Initializes the data structures
        TaskQueue queue = new TaskQueue();
        ResultTable results = new ResultTable();

        // Creates the threads
        Thread[] threads = new Thread[Runtime.getRuntime().availableProcessors()];

        long startTime = System.currentTimeMillis();

        // Starts the threads calculating digits of pi
        for (int thread = 0; thread < Runtime.getRuntime().availableProcessors(); thread ++) {
            threads[thread] = new Thread(new DigitThread(queue, results));
            threads[thread].start();
        }

        // Waits for all the threads to finish after calculating all the digits
        for (Thread thread: threads) {
            try{
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            
        }

        long endTime = System.currentTimeMillis();

        // Prints the resulting 1000 digits of pi
        System.out.print("3.");
        for (int i=1;i<=1000;i++) {
            System.out.print(results.getValue(i));
        }

        // Prints the time the computation took
        System.out.printf("\nPi Computation took %d ms\n", endTime - startTime);
    }

    
}