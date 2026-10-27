import java.util.HashMap;

public class ResultTable {
    private HashMap<Integer, Integer> resultTable;

    public ResultTable() {
        this.resultTable = new HashMap<>();
    }

    // Sets a value for a given key
    public void setValue(int key, int value) {
        this.resultTable.put(key, value);
    }

    // Gets the value for a given key
    public int getValue(int key) {
        return this.resultTable.get(key);
    }
}