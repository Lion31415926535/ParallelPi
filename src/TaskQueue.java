import java.util.LinkedList;
import java.util.ArrayList;

public class TaskQueue {
    private LinkedList<Integer> taskQueue;

    /**
     * Initializes the task queue and adds numbers to it
     */
    public TaskQueue() {
        this.taskQueue = new LinkedList<>();

        ArrayList<Integer> numbers = createListOfNumbers();

        for (Integer number : numbers) {
            this.taskQueue.add(number);
        }
    }

    /**
     * Creates an array list of numbers 1 to 1000 and randomizes the order
     * @return An ArrayList containing numbers 1 to 1000 in randomized order
     */
    private ArrayList<Integer> createListOfNumbers() {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        for (int i=1; i<=1000; i++) {
            listOfNumbers.add(i);
        }

        java.util.Collections.shuffle(listOfNumbers);

        return listOfNumbers;
    }

    /**
     * Returns the next number in the queue
     * If the queue is empty then returns -1
     * @return The number for the next digit of pi to be calculated
     */
    public int getNextNumber() {
        if (isEmpty()) {
            return -1;
        }
        int nextNumber = this.taskQueue.getFirst();
        taskQueue.remove();
        return nextNumber;
    }

    /**
     * @return Returns true if the queue is empty
     */
    private boolean isEmpty() {
        return this.taskQueue.isEmpty();
    }
}