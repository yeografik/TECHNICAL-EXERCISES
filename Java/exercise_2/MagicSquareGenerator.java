package Java.exercise_2;

import org.apache.commons.lang3.mutable.MutableInt;

public class MagicSquareGenerator {
    
    public int[][] generate(int n) {
        if (n < 0 || n % 2 == 0)
            throw new IllegalArgumentException("n must be a postive odd number");

        int[][] square = new int[n][n];
        int maxValue = n * n;
        int midleIndex = (n - 1) / 2;
        int value = maxValue;
        MutableInt i = new MutableInt(midleIndex), j = new MutableInt(0);
        for (int iterations = 0; iterations < n; iterations++) {
            for (int internalIterations = 0; internalIterations < n; internalIterations++) {
                square[i.getValue()][j.getValue()] = value;
                value--;
                getNextPosition(i, j, n);
            }
            getPreviousPosition(i, j, n);
            j.increment();
        }

        return square;
    }

    private void getNextPosition(MutableInt i, MutableInt j, int n) {
        //next positions are calculated like in circular arrays
        i.setValue((i.getValue() + 1) % n);

        if (j.getValue() == 0)
            j.setValue(n - 1);
        else
            j.decrement();
    }

    private void getPreviousPosition(MutableInt i, MutableInt j, int n) {
        j.setValue((j.getValue() + 1) % n);

        if (i.getValue() == 0)
            i.setValue(n - 1);
        else
            i.decrement();
    }
}