import java.util.HashMap;

public class ResultTable {
    private HashMap<Integer, Character> resultTable;

    public ResultTable() {
        this.resultTable = new HashMap<>();
    }

    // Sets a value for a given key
    public void setValue(int key, char value) {
        this.resultTable.put(key, value);
    }

    // Gets the value for a given key
    public char getValue(int key) {
        return this.resultTable.get(key);
    }
}