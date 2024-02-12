import java.util.Arrays;

public class Stacky {

    int topOfStack = -1;
    String[] data;
    int stackSize;

    public Stacky(int stackSize) {
        this.stackSize = stackSize;
        data = new String[stackSize];
    }

    public void push(String value) {
        if (topOfStack + 1 >= stackSize) {
            throw new StackOverflowError("The Stack is full!");
        }
        topOfStack++;
        data[topOfStack] = value;
    }

    public String pop() {
        String returnData = data[topOfStack];
        //data[topOfStack] = null;
        topOfStack--;
        return returnData;
    }

    @Override
    public String toString() {
        String ret = "[ ";
        for (int i = 0; i <= topOfStack; i++) {
            ret += data[i] + " ";
        }
        ret += " ]";
        return ret;
    }
}
