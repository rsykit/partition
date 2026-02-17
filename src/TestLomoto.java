import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLomoto {

    //test on the sorted array
    //[10, 17, 19, 21, 44, 55, 57, 63, 65, 67]
    @Test
    public void testSorted()
    {
        int[] array = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67};
        int[] expected = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67};
        int pivotIndex = Lomoto.lomoto(array, 0, array.length - 1);
        assertEquals(0, pivotIndex);
        assertArrayEquals(expected, array);

        
    }

    //test on the empty array
    //return IllegalArgumentException
    @Test
    public void testEmpty()
    {
        int[] array = {};
        try {
            Lomoto.lomoto(array, 0, array.length - 1);
        } catch (IllegalArgumentException e) {
            assertEquals("Input array cannot be null or indices are out of bounds", e.getMessage());
        }
    }

    //test on the unsorted array
    //[84, 3, 7, 1, 9, 6, 2, 5]
    @Test
    public void testUnsorted()
    {
        int[] array = {84, 3, 7, 1, 9, 6, 2, 5};
        int[] expected = {5, 3, 7, 1, 9, 6, 2, 84};
        int pivotIndex = Lomoto.lomoto(array, 0, array.length - 1);
        assertEquals(7, pivotIndex);
        assertArrayEquals(expected, array);
    }

}
