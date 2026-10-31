public class Assn3 {
    public static void main(String[] args) {
        TaskQueue queue = new TaskQueue();

        ResultTable results = new ResultTable();

        Thread[] threads = new Thread[Runtime.getRuntime().availableProcessors()];

        long startTime = System.currentTimeMillis();

        for (int thread = 0; thread < Runtime.getRuntime().availableProcessors(); thread ++) {
            threads[thread] = new Thread(new DigitThread(queue, results));
            threads[thread].start();
        }

        for (Thread thread: threads) {
            try{
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            
        }

        long endTime = System.currentTimeMillis();

        System.out.print("3.");
        for (int i=1;i<=1000;i++) {
            System.out.print(results.getValue(i));
        }

        System.out.printf("\nPi Computation took %d ms\n", endTime - startTime);
    }

    
}