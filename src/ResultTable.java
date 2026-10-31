import java.util.HashMap;

public class ResultTable {
    private HashMap<Integer, Character> resultTable;
    private int counter;

    public ResultTable() {
        this.resultTable = new HashMap<>();
        this.counter = 0;
    }

    // Sets a value for a given key
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

    // Gets the value for a given key
    public char getValue(int key) {
        return this.resultTable.get(key);
    }
}