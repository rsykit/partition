/**
 * Junit test for Hoare.java
 * 
 * Test on the array 
 * [10, 17, 19, 21, 44, 55, 57, 63, 65, 67]
 * empty array
 * [84, 3, 7, 1, 9, 6, 2, 5]
 */

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class TestHoare {
    
    @Test
    public void testSorted()
    {
        int[] array = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67};
        int[] expected = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67};
        int pivotIndex = Hoare.hoarePartition(array, 0, array.length - 1);
        assertEquals(0, pivotIndex);
        assertArrayEquals(expected, array);

        
    }
}