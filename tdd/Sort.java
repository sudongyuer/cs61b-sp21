import org.junit.Test;

import static org.junit.Assert.*;

public class Sort {
    public static void selectSort(String[] input) {
        selectSort(input, 0);
    }

    public static void selectSort(String[] input, int startIndex) {
        //base case return
        if (startIndex == input.length -1) {
            return;
        }
        //find the smallest item index
        int smallestItemIndex = findSmallestItemIndex(input, startIndex);
        //swap it with the start position
        swap(input, startIndex, smallestItemIndex);
        // recursively sort the rest of the array
        selectSort(input, startIndex + 1);
    }

    private static void swap(String[] input, int startIndex, int smallestItemIndex) {
        String temp = input[startIndex];
        input[startIndex] = input[smallestItemIndex];
        input[smallestItemIndex] = temp;
    }

    @Test
    public void testFindSmallestItemIndex() {
        String[] input = {"hello", "world", "my"};
        int expected = 2;
        int actual = findSmallestItemIndex(input, 1);
        assertEquals(expected, actual);
    }

    private static int findSmallestItemIndex(String[] input, int startIndex) {
        int smallestIndex = startIndex;
        for (int i = startIndex; i < input.length; i++) {
            if (input[i].compareTo(input[smallestIndex]) < 0) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    @Test
    public void testSwap() {
        String[] input = {"hello", "world"};
        String[] expected = {"world", "hello"};
        swap(input, 0, 1);
        assertArrayEquals(expected, input);
    }

}
