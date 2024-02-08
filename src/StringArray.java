import java.util.Arrays;

public class StringArray {

    String[] values;
    public StringArray(String[] values) {
        this.values = values;
    }

    public void add(String value) {
        String[] newArr = new String[values.length + 1];
        int i;
        for (i = 0; i < values.length; i++) {
            newArr[i] = values[i];
        }
        newArr[values.length] = value;
        values = newArr;
    }
    public void add(int index, String value) {

        add(null);

        for (int i = values.length-1; i > index; i--) {
            values[i] = values[i-1];
        }
        values[index] = value;
    }

    public String toString() {
        return Arrays.toString(values);
    }
    public int size() {
        return values.length;
    }

    public void reverse() {
        int j = 0;
        String[] b = new String[values.length];
        for (int i = values.length-1; i >= 0; i--) {
            b[j] = values[i];
            j++;
        }
        values = b;
    }

}
