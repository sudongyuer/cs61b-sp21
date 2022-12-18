import org.junit.Test;

import static org.junit.Assert.*;

public class TestSort {
    @Test
    public void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.selectSort(input);
        assertArrayEquals(expected, input);
    }
}
