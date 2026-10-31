import java.util.HashMap;

public class ResultTable {
    private HashMap<Integer, Character> resultTable;
    private int counter;

    public ResultTable() {
        this.resultTable = new HashMap<>();
        this.counter = 0;
    }

    /**
     * Stores a value of pi at the given postion
     * Counts how many digits have been calculated and prints out dots every 10 digits
     * @param key The position of the hash map to store the value at
     * @param value The value to be stored
     */
    public void setValue(int key, char value) {
        this.resultTable.put(key, value);

        counter++;
        if (counter % 10 == 0) {
            System.out.print(".");
        }
        if (counter % 200 == 0) {
            System.out.println();
        }
        System.out.flush();
    }


    /**
     * Gets the value for a given key
     * @param key The key for the location of the desired value
     * @return The digit at the desired location, returned as a character
     */
    public char getValue(int key) {
        return this.resultTable.get(key);
    }
}