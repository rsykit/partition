public class Hoare {
    
    /**
     * This method implements the Hoare partitioning algorithm. 
     * It takes an array, a low index, and a high index as input and partitions the array around a pivot element. 
     * The pivot is chosen as the first element of the array. 
     * The method returns the index of the pivot element after partitioning.
     * 
     * @param arr
     * @param low
     * @param high
     * @return
     * @throws IllegalArgumentException if the input array is null or if low and high indices are out of bounds
     */
    public static int hoarePartition(int[] arr, int low, int high)
    {
        //check if the input array is null
        if (arr == null || low < 0 || high >= arr.length || low > high) 
        {
            throw new IllegalArgumentException("Input array cannot be null or indices are out of bounds");
        }
    
        //pivot is the first element of the array
        int pivot = arr[low];
        //i is the index of the smaller element
        int i = low - 1;
        //j is the index of the larger element
        int j = high + 1;

        //loop until i is less than j
        while (true) 
        {
            //increment i until arr[i] is greater than or equal to the pivot
            do 
            {
                i++;
            }
            while (arr[i] < pivot);
            //decrement j until arr[j] is less than or equal to the pivot
            do 
            {
                j--;
            } 
            while (arr[j] > pivot);
            //if i is greater than or equal to j, return j
            if (i >= j) 
            {
                return j;
            }

            //swap the elements at index i and j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}



