import java.util.LinkedList;
import java.util.ArrayList;

public class TaskQueue {
    private LinkedList<Integer> taskQueue;

    public TaskQueue() {
        taskQueue = new LinkedList<>();

        ArrayList<Integer> numbers = createListOfNumbers();

        for (Integer number : numbers) {
            taskQueue.add(number);
        }
    }

    // Creates an array list of numbers 1 to 1000 and randomizes the order
    private ArrayList<Integer> createListOfNumbers() {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        for (int i=1; i<=1000; i++) {
            listOfNumbers.add(i);
        }

        java.util.Collections.shuffle(listOfNumbers);

        return listOfNumbers;
    }
}