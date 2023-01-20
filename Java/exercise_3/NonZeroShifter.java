package Java.exercise_3;

public class NonZeroShifter {

    /*
     * algorithm complexity is n for best, worst and average case, being n the length of the array
    */
    public static int[] shift(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array can't be null");
        }
        
        int lastIndex = array.length - 1, i = 0;
        while (i < lastIndex) {
            if (array[i] == 0) {
                swap(i, lastIndex, array);
                lastIndex--;
            } else {
                i++;
            }
        }
        return array;
    }

    private static void swap(int a, int b, int[] array) {
        int c = array[a];
        array[a] = array[b];
        array[b] = c;
    }
}