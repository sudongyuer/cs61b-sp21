public class TestSort {
    public static void main(String[] args) {
        testSort();
    }

    private static void testSort() {
        String[] input = {"world", "hello", "my"};
        String[] expected = {"world", "hello", "my"};
        Sort.sort(input);
        org.junit.Assert.assertArrayEquals(expected, input);
    }
}
